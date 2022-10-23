package subway.service;

import subway.domain.Section;
import subway.domain.Station;
import subway.repository.SectionRepository;
import subway.type.InputType;
import subway.validation.SectionValidation;
import subway.view.input.SectionInput;
import subway.view.output.InfoOutPut;

import java.util.LinkedList;
import java.util.Scanner;

public class SectionService {

    public static boolean activateSelection(String input, Scanner sc) {
        if (input.equals(InputType.ONE.getText())) {
            return add(sc);
        }
        return delete(sc);
    }

    private static boolean add(Scanner sc) {
        String lineName = SectionInput.scanSectionLineInput(sc);
        if (!SectionValidation.isValidatedLineName(lineName)) {
            return false;
        }
        String stationName = SectionInput.scanSectionStationInput(sc);
        if (!SectionValidation.isValidatedStationName(stationName, lineName)) {
            return false;
        }
        String order = SectionInput.scanSectionOrderInput(sc);
        if (!SectionValidation.isValidatedOrder(lineName, order)) {
            return false;
        }
        Section section = SectionRepository.findSectionByLineName(lineName);
        LinkedList<Station> stationList = section.getStationList();
        stationList.add(Integer.parseInt(order) - 1, new Station(stationName));
        InfoOutPut.printSectionRegisterInfo();
        return true;
    }

    private static boolean delete(Scanner sc) {
        String lineName = SectionInput.scanSectionDeleteLine(sc);
        if (!SectionValidation.isValidatedLineName(lineName)) {
            return false;
        }
        String stationName = SectionInput.scanSectionDeleteStation(sc);
        if (!SectionValidation.isStationRegisterInSection(lineName, stationName)) {
            return false;
        }
        Section section = SectionRepository.findSectionByLineName(lineName);
        LinkedList<Station> stationList = section.getStationList();
        int targetIdx = 0;
        for(int i=0; i<stationList.size(); i++) {
            Station station = stationList.get(i);
            String name = station.getName();
            if (name.equals(stationName)) {
                targetIdx = i;
            }
        }
        stationList.remove(targetIdx);
        InfoOutPut.printSectionDeleteInfo();
        return true;
    }
}
