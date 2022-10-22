package subway.view.output;

import subway.type.InfoType;
import subway.type.StationMenu;

import java.util.List;

public class StationOutput {

    public static void printStationMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append(StationMenu.STATION_SCREEN.getText())
                .append(StationMenu.STATION_REGISTER.getText())
                .append(StationMenu.STATION_DELETE.getText())
                .append(StationMenu.STATION_SHOW.getText())
                .append(StationMenu.STATION_BACK.getText());
        System.out.print(sb);
    }

    public static void printAllStation(List<String> stationNameList) {
        StringBuilder sb = new StringBuilder();
        sb.append(StationMenu.STATION_ALL_SCREEN.getText());
        for (String stationName : stationNameList) {
            sb.append(InfoType.INFO.getText()+" "+stationName+"\n");
        }
        sb.append("\n");
        System.out.print(sb);



    }


}
