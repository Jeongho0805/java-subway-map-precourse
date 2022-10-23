package subway.service;

import subway.domain.Line;
import subway.domain.Section;
import subway.domain.Station;
import subway.repository.LineRepository;
import subway.repository.SectionRepository;
import subway.repository.StationRepository;
import subway.type.InfoType;
import subway.type.InputType;
import subway.validation.LineValidation;
import subway.validation.StationValidation;
import subway.view.input.LineInput;
import subway.view.input.StationInput;
import subway.view.output.InfoOutPut;
import subway.view.output.LineOutput;

import java.util.Scanner;

public class LineService {

    public static boolean activateSelection(String input, Scanner sc) {
        if (input.equals(InputType.ONE.getText())) {
            return add(sc);
        }
        if (input.equals(InputType.TWO.getText())) {
            return delete(sc);
        }
        return show(sc);
    }

    private static boolean add(Scanner sc) {
        String lineName = LineInput.scanLineRegisterName(sc);
        if (!LineValidation.isValidatedRegisterLineName(lineName)) {
            return false;
        }
        String upStationName = LineInput.scanLineFirstStation(sc);
        String downStationName = LineInput.scanLineLastStation(sc);
        if (!LineValidation.isValidatedLineStationName(upStationName, downStationName)) {
            return false;
        }
        addLineAndSection(lineName, upStationName, downStationName);
        InfoOutPut.printLineRegisterInfo();
        return true;
    }

    private static boolean delete(Scanner sc) {
        String lineName = LineInput.scanLineDeleteName(sc);
        if (!LineValidation.isValidatedDeleteLineName(lineName)) {
            return false;
        }
        deleteLineInSection(lineName);
        deleteLineInLineList(lineName);
        InfoOutPut.printLineDeleteInfo();
        return true;
    }

    private static boolean show(Scanner sc) {
        LineOutput.printAllLine();
        return true;
    }


    private static void addLineAndSection(String lineName, String upStationName, String downStationName) {
        Line line = new Line(lineName);
        LineRepository.addLine(line);
        Section section = new Section(line, new Station(upStationName), new Station(downStationName));
        SectionRepository.addSection(section);
    }

    private static void deleteLineInSection(String lineName) {
        SectionRepository.deleteByLineName(lineName);
    }

    private static void deleteLineInLineList(String lineName) {
        LineRepository.deleteLineByName(lineName);
    }
}
