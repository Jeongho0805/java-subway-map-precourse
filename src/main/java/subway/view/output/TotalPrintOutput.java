package subway.view.output;

import subway.domain.Line;
import subway.domain.Section;
import subway.domain.Station;
import subway.type.InfoType;
import subway.type.TotalPrintMenu;

import java.util.List;

public class TotalPrintOutput {
    public static void printTotalSubwayList(List<Section> sections) {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalPrintMenu.TOTAL_PRINT_SCREEN.getText());
        for (Section section : sections) {
            Line line = section.getLine();
            List<Station> stationList = section.getStationList();
            sb.append(InfoType.INFO.getText() + " " + line.getName() + "\n");
            sb.append(TotalPrintMenu.TOTAL_PRINT_SPLIT_LINE.getText());
            for (Station station : stationList) {
                sb.append(InfoType.INFO.getText() + " " + station.getName() + "\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
