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


}
