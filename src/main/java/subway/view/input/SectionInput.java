package subway.view.input;

import subway.type.LineMenu;
import subway.type.SectionMenu;
import subway.type.SelectionGuideMention;

import java.util.Scanner;

public class SectionInput {

    public static String scanSectionInput(Scanner sc) {
        System.out.print(SelectionGuideMention.GUIDE_CHOOSE_MENTION.getText());
        String sectionMenu = sc.nextLine();
        System.out.println();
        return sectionMenu;
    }

    public static String scanSectionLineInput(Scanner sc) {
        System.out.print(SectionMenu.SECTION_LINE_REGISTER.getText());
        String lineName = sc.nextLine();
        System.out.println();
        return lineName;
    }

    public static String scanSectionStationInput(Scanner sc) {
        System.out.print(SectionMenu.SECTION_STATION_REGISTER.getText());
        String stationName = sc.nextLine();
        System.out.println();
        return stationName;
    }

    public static String scanSectionOrderInput(Scanner sc) {
        System.out.print(SectionMenu.SECTION_ORDER_REGISTER.getText());
        String order = sc.nextLine();
        System.out.println();
        return order;
    }

    public static String scanSectionDeleteLine(Scanner sc) {
        System.out.print(SectionMenu.SECTION_LINE_DELETE.getText());
        String lineName = sc.nextLine();
        System.out.println();
        return lineName;
    }

    public static String scanSectionDeleteStation(Scanner sc) {
        System.out.print(SectionMenu.SECTION_STATION_DELETE.getText());
        String stationName = sc.nextLine();
        System.out.println();
        return stationName;
    }
}
