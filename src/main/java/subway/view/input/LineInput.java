package subway.view.input;

import subway.type.LineMenu;
import subway.type.SelectionGuideMention;
import subway.type.StationMenu;

import java.util.Scanner;

public class LineInput {
    public static String scanLineInput(Scanner sc) {
        System.out.print(SelectionGuideMention.GUIDE_CHOOSE_MENTION.getText());
        String LineMenu = sc.nextLine();
        System.out.println();
        return LineMenu;
    }

    public static String scanLineRegisterName(Scanner sc) {
        System.out.print(LineMenu.LINE_REGISTER_GUIDE.getText());
        String lineName = sc.nextLine();
        System.out.println();
        return lineName;
    }

    public static String scanLineFirstStation(Scanner sc) {
        System.out.print(LineMenu.LINE_FIRST_STATION_GUIDE.getText());
        String firstStation = sc.nextLine();
        System.out.println();
        return firstStation;
    }

    public static String scanLineLastStation(Scanner sc) {
        System.out.print(LineMenu.LINE_LAST_STATION_GUIDE.getText());
        String lastStation = sc.nextLine();
        System.out.println();
        return lastStation;
    }

    public static String scanLineDeleteName(Scanner sc) {
        System.out.print(LineMenu.LINE_DELETE_GUIDE.getText());
        String LineName = sc.nextLine();
        System.out.println();
        return LineName;
    }
}
