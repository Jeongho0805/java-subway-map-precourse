package subway.config;

import subway.domain.Line;
import subway.domain.Section;
import subway.domain.Station;
import subway.repository.LineRepository;
import subway.repository.SectionRepository;
import subway.repository.StationRepository;

import java.util.LinkedList;

public class Config {

    public static void dataInit() {
        initStation();
    }

    private static void initStation() {
        // 교대역, 강남역, 역삼역, 남부터미널역, 양재역, 양재시민의숲역, 매봉역이 등
        Station station1 = new Station("교대역");
        Station station2 = new Station("강남역");
        Station station3 = new Station("역삼역");
        Station station4 = new Station("남부터미널역");
        Station station5 = new Station("양재역");
        Station station6 = new Station("양재시민의숲역");
        Station station7 = new Station("매봉역");

        Line line1 = new Line("2호선");
        Line line2 = new Line("3호선");
        Line line3 = new Line("신분당선");

        LinkedList<Station> stationList1 = new LinkedList<>();
        stationList1.add(station1);
        stationList1.add(station2);
        stationList1.add(station3);
        Section section1 = new Section(line1, stationList1);

        LinkedList<Station> stationList2 = new LinkedList<>();
        stationList2.add(station1);
        stationList2.add(station4);
        stationList2.add(station5);
        stationList2.add(station7);
        Section section2 = new Section(line2, stationList2);

        LinkedList<Station> stationList3 = new LinkedList<>();
        stationList3.add(station2);
        stationList3.add(station5);
        stationList3.add(station6);
        Section section3 = new Section(line3, stationList3);

        StationRepository.addStation(station1);
        StationRepository.addStation(station2);
        StationRepository.addStation(station3);
        StationRepository.addStation(station4);
        StationRepository.addStation(station5);
        StationRepository.addStation(station6);
        StationRepository.addStation(station7);

        LineRepository.addLine(line1);
        LineRepository.addLine(line2);
        LineRepository.addLine(line3);

        SectionRepository.addSection(section1);
        SectionRepository.addSection(section2);
        SectionRepository.addSection(section3);
    }
}
