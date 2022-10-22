package subway.domain;

import java.util.HashMap;
import java.util.LinkedList;

public class Section {

    private Line line;

    private LinkedList<Station> stationList;

    public Section(Line line, Station upStation, Station downStation) {
        LinkedList<Station> stationList = new LinkedList<>();
        stationList.add(upStation);
        stationList.add(downStation);

        this.line = line;
        this.stationList = stationList;
    }

    public Section(Line line, LinkedList<Station> stationList) {
        this.line = line;
        this.stationList = stationList;
    }

    public Line getLine() {
        return line;
    }

    public LinkedList<Station> getStationList() {
        return stationList;
    }
}
