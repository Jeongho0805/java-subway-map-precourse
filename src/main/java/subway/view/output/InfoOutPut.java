package subway.view.output;

import subway.type.InfoType;
import subway.view.input.StationInput;

public class InfoOutPut {

    public static void printStationRegisterInfo() {
        System.out.print(InfoType.STATION_REGISTER_INFO.getText());
    }

    public static void printStationDeleteInfo() {
        System.out.print(InfoType.STATION_DELETE_INFO.getText());
    }

    public static void printLineRegisterInfo() {
        System.out.print(InfoType.LINE_REGISTER_INFO.getText());
    }

    public static void printLineDeleteInfo() {
        System.out.print(InfoType.LINE_DELETE_INFO.getText());
    }

    public static void printSectionRegisterInfo() {
        System.out.print(InfoType.SECTION_REGISTER_INFO.getText());
    }

    public static void printSectionDeleteInfo() {
        System.out.print(InfoType.SECTION_DELETE_INFO.getText());
    }
}
