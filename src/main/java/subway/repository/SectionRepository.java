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

    public static void deleteByLineName(String lineNameInput) {
        for (Section section : sections) {
            Line line = section.getLine();
            String lineName = line.getName();
            if(lineName.equals(lineNameInput)) {
                sections.remove(section);
                break;
            }
        }
    }

    public static int findSectionLengthByLineName(String lineNameInput) {
        for (Section section : sections) {
            Line line = section.getLine();
            String lineName = line.getName();

            if (lineName.equals(lineNameInput)) {
                LinkedList<Station> stationList = section.getStationList();
                return stationList.size();
            }
        }
        return 0;
    }

    public static Section findSectionByLineName(String lineNameInput) {
        for (Section section : sections) {
            Line line = section.getLine();
            String lineName = line.getName();
            if (lineName.equals(lineNameInput)) {
                return section;
            }
        }
        return null;
    }

//    public static boolean deleteLineByName(String name) {
//        return lines.removeIf(line -> Objects.equals(line.getName(), name));
//    }
}
