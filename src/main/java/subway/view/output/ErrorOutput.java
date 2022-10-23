package subway.view.output;

import subway.type.ErrorType;

public class ErrorOutput {
    public static void printSelectionError() {
        System.out.print(ErrorType.WRONG_SELECTION.getText());
    }

    public static void printStationDuplicatedError() {
        System.out.print(ErrorType.STATION_DUPLICATED_ERROR.getText());
    }

    public static void printStationLengthError() {
        System.out.print(ErrorType.STATION_LENGTH_ERROR.getText());
    }

    public static void printStationLastWordError() {
        System.out.print(ErrorType.STATION_LASTWORD_ERROR.getText());
    }

    public static void printStationNoExistError() {
        System.out.print(ErrorType.STATION_NOEXIST_ERROR.getText());
    }

    public static void printStationSectionContainsError() {
        System.out.print(ErrorType.STATION_SECTION_CONTAIN_ERROR.getText());
    }

    public static void printLineDuplicatedError() {
        System.out.print(ErrorType.LINE_DUPLICATED_ERROR.getText());
    }

    public static void printLineLengthError() {
        System.out.print(ErrorType.LINE_LENGTH_ERROR.getText());
    }

    public static void printLineLastWordError() {
        System.out.print(ErrorType.LINE_LASTWORD_ERROR.getText());
    }

    public static void printLineStationError() {
        System.out.print(ErrorType.LINE_STATION_ERROR.getText());
    }

    public static void printLineDeleteError() {
        System.out.print(ErrorType.LINE_DELETE_ERROR.getText());
    }

    public static void printSectionLineError() {
        System.out.print(ErrorType.SECTION_NOEXIST_LINE_ERROR.getText());
    }

    public static void printSectionStationError() {
        System.out.print(ErrorType.SECTION_ADD_STATION_ERROR.getText());
    }

    public static void printSectionAlreadyRegisterError() {
        System.out.print(ErrorType.SECTION_ALREADY_REGISTER_ERROR.getText());
    }

    public static void printSectionBoundaryError() {
        System.out.print(ErrorType.SECTION_BOUNDARY_ERROR.getText());
    }

    public static void printSectionDeleteStationError() {
        System.out.print(ErrorType.SECTION_DELETE_STATION_ERROR.getText());
    }
}
