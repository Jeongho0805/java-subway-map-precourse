package subway.validation;

import subway.domain.Section;
import subway.domain.Station;
import subway.repository.LineRepository;
import subway.repository.SectionRepository;
import subway.repository.StationRepository;
import subway.type.InputType;
import subway.view.output.ErrorOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SectionValidation {
    public static boolean isValidatedSectionSelection(String input) {
        ArrayList<String> sectionInputList = getSectionInputList();
        return sectionInputList.contains(input);
    }

    public static boolean isBackSelection(String input) {
        return input.equals(InputType.BACK.getText());
    }

    private static ArrayList<String> getSectionInputList() {
        ArrayList<String> sectionInputList = new ArrayList<>();
        sectionInputList.add(InputType.ONE.getText());
        sectionInputList.add(InputType.TWO.getText());
        return sectionInputList;
    }

    public static boolean isValidatedLineName(String input) {
        List<String> lineNameList = LineRepository.findAllLineName();
        if (lineNameList.contains(input)) {
            return true;
        }
        ErrorOutput.printSectionLineError();
        return false;
    }

    public static boolean isValidatedStationName(String stationName, String lineName) {
        if (!isStationRegisterInList(stationName)) {
            ErrorOutput.printSectionStationError();
            return false;
        }
        if (isStationAlreadyRegisterInSection(stationName, lineName)) {
            ErrorOutput.printSectionAlreadyRegisterError();
            return false;
        }
        return true;
    }

    public static boolean isValidatedOrder(String lineName, String order) {
        int stationListLength = SectionRepository.findSectionLengthByLineName(lineName);
        if (Integer.parseInt(order) > stationListLength) {
            ErrorOutput.printSectionBoundaryError();
            return false;
        }
        return true;
    }

    public static boolean isStationRegisterInSection(String lineName, String stationName) {
        if (!isStationAlreadyRegisterInSection(stationName, lineName)) {
            ErrorOutput.printSectionDeleteStationError();
            return false;
        }
        return true;
    }

    private static boolean isStationAlreadyRegisterInSection(String stationName, String lineName) {
        Section section = SectionRepository.findSectionByLineName(lineName);
        LinkedList<Station> stationList = section.getStationList();
        for (Station station : stationList) {
            if (stationName.equals(station.getName())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStationRegisterInList(String stationName) {
        List<String> stationNameList = StationRepository.findAllStationName();
        if (stationNameList.contains(stationName)) {
            return true;
        }
        return false;
    }
}
