package subway.repository;

import subway.domain.Station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static List<String> findAllStationName() {
        List<String> allStationName = new ArrayList<>();
        for (Station station : stations) {
            allStationName.add(station.getName());
        }
        return allStationName;
    }
}
