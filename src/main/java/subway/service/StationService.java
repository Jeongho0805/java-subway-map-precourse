package subway.service;

import subway.domain.Station;
import subway.repository.StationRepository;
import subway.type.InputType;
import subway.validation.StationValidation;
import subway.view.input.StationInput;
import subway.view.output.ErrorOutput;
import subway.view.output.InfoOutPut;
import subway.view.output.StationOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StationService {
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
        String stationName = StationInput.scanStationRegisterName(sc);
        if (StationValidation.isValidatedRegisterStationName(stationName)) {
            Station station = new Station(stationName);
            StationRepository.addStation(station);
            InfoOutPut.printStationRegisterInfo(); // 등록 info 메세지
            return true;
        }
        return false;
    }

    private static boolean delete(Scanner sc) {
        /**
         * 등록 되어 있는 역인지 체크 , 노선에 있는 역인지 체크
         */
        String stationName = StationInput.scanStationDeleteName(sc);
        if (StationValidation.isValidatedDeleteStationName(stationName)) {
            StationRepository.deleteStation(stationName);
            InfoOutPut.printStationDeleteInfo();
            return true;
        }
        return false;
    }

    private static boolean show(Scanner sc) {
        List<Station> stations = StationRepository.stations();
        List<String> stationNameList = toStringList(stations);
        StationOutput.printAllStation(stationNameList);
        return true;
    }

    private static List<String> toStringList(List<Station> stations) {
        List<String> stationNameList = new ArrayList<>();
        for (Station station : stations) {
            stationNameList.add(station.getName());
        }
        return stationNameList;
    }
}
