package subway.validation;

import subway.domain.Section;
import subway.domain.Station;
import subway.repository.SectionRepository;
import subway.repository.StationRepository;
import subway.type.InputType;
import subway.type.StationMenu;
import subway.view.output.ErrorOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StationValidation {

    public static boolean isValidatedStationSelection(String input) {
        ArrayList<String> stationInputList = getStationInputList();
        return stationInputList.contains(input);
    }

    public static boolean isValidatedRegisterStationName(String stationName) {
        if (duplicatedCheck(stationName)) {
            ErrorOutput.printStationDuplicatedError();
            return false;
        }
        if (lengthCheck(stationName)) {
            ErrorOutput.printStationLengthError();
            return false;
        }

        if (lastWordCheck(stationName)) {
            ErrorOutput.printStationLastWordError();
            return false;
        }
        return true;

    }

    /**
     * 1. 역 등록 여부 검증
     * 2. 라인에 등록 여부 검증
     */
    public static boolean isValidatedDeleteStationName(String stationName) {
        if (!StationsContainCheck(stationName)) {
            ErrorOutput.printStationNoExistError();
            return false;
        }
        if (StationInSectionCheck(stationName)) {
            ErrorOutput.printStationSectionContainsError();
            return false;
        }
        return true;
    }

    private static boolean StationInSectionCheck(String stationName) {
        LinkedList<Station> allStationList = SectionRepository.getAllStationList();
        for (Station station : allStationList) {
            if (station.getName().equals(stationName)) {
                return true;
            }
        }
        return false;
    }

    private static boolean StationsContainCheck(String stationName) {
        List<Station> stations = StationRepository.stations();
        for (Station station : stations) {
            if (station.getName().equals(stationName)) {
                return true;
            }
        }
        return false;
    }

    private static boolean lastWordCheck(String stationName) {
        String lastWord = stationName.substring(stationName.length()-1);
        return !lastWord.equals("역");
    }

    private static boolean lengthCheck(String stationName) {
        int length = stationName.length();
        return length < 3;
    }

    private static boolean duplicatedCheck(String stationName) {
        List<Station> stations = StationRepository.stations();
        for (Station station : stations) {
            if (station.getName().equals(stationName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBackSelection(String input) {
        return input.equals(InputType.BACK.getText());
    }

    public static ArrayList<String> getStationInputList() {
        ArrayList<String> stationInputList = new ArrayList<>();
        stationInputList.add(InputType.ONE.getText());
        stationInputList.add(InputType.TWO.getText());
        stationInputList.add(InputType.THREE.getText());
        return stationInputList;
    }
}
