package subway.repository;

import subway.domain.Line;
import subway.domain.Section;
import subway.domain.Station;

import java.util.*;

public class SectionRepository {

    private static final List<Section> sections = new ArrayList<>();

    public static List<Section> sections() {
        return Collections.unmodifiableList(sections);
    }

    public static void addSection(Section section) {
        sections.add(section);
    }

    public static LinkedList<Station> getAllStationList() {
        LinkedList<Station> allStationList = new LinkedList<>();
        for (Section section : sections) {
            LinkedList<Station> stationList = section.getStationList();
            allStationList.addAll(stationList);
        }
        return allStationList;
    }

//    public static boolean deleteLineByName(String name) {
//        return lines.removeIf(line -> Objects.equals(line.getName(), name));
//    }
}
