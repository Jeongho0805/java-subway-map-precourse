package subway.view.input;

import subway.type.SelectionGuideMention;
import subway.type.StationMenu;
import subway.view.output.StationOutput;

import java.util.Scanner;

public class StationInput {
    public static String scanStationInput(Scanner sc) {
        System.out.print(SelectionGuideMention.GUIDE_CHOOSE_MENTION.getText());
        String stationMenu = sc.nextLine();
        System.out.println();
        return stationMenu;
    }

    public static String scanStationRegisterName(Scanner sc) {
        System.out.print(StationMenu.STATION_REGISTER_GUIDE.getText());
        String stationName = sc.nextLine();
        System.out.println();
        return stationName;
    }

    public static String scanStationDeleteName(Scanner sc) {
        System.out.print(StationMenu.STATION_DELETE_GUIDE.getText());
        String stationName = sc.nextLine();
        System.out.println();
        return stationName;

    }
}
