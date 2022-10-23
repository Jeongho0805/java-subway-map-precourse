package subway.validation;

import subway.domain.Line;
import subway.domain.Station;
import subway.repository.LineRepository;
import subway.repository.StationRepository;
import subway.type.InputType;
import subway.view.output.ErrorOutput;
import subway.view.output.LineOutput;

import java.util.ArrayList;
import java.util.List;

public class LineValidation {

    public static boolean isValidatedLineSelection(String input) {
        ArrayList<String> LineInputList = getLineInputList();
        return LineInputList.contains(input);
    }

    public static boolean isValidatedRegisterLineName(String lineName) {
        if (duplicatedCheck(lineName)) {
            ErrorOutput.printLineDuplicatedError();
            return false;
        }
        if (lengthCheck(lineName)) {
            ErrorOutput.printLineLengthError();
            return false;
        }
        if (lastWordCheck(lineName)) {
            ErrorOutput.printLineLastWordError();
            return false;
        }
        return true;
    }

    public static boolean isBackSelection(String input) {
        return input.equals(InputType.BACK.getText());
    }

    private static ArrayList<String> getLineInputList() {
        ArrayList<String> lineInputList = new ArrayList<>();
        lineInputList.add(InputType.ONE.getText());
        lineInputList.add(InputType.TWO.getText());
        lineInputList.add(InputType.THREE.getText());
        return lineInputList;
    }



    private static boolean duplicatedCheck(String lineName) {
        List<Line> lines = LineRepository.lines();
        for (Line line : lines) {
            if (line.getName().equals(lineName)) {
                return true;
            }
        }
        return false;
    }
    private static boolean lengthCheck(String lineName) {
        int length = lineName.length();
        return length < 3;
    }
    private static boolean lastWordCheck(String LineName) {
        String lastWord = LineName.substring(LineName.length()-1);
        return !lastWord.equals("선");
    }

    public static boolean isValidatedLineStationName(String upStation, String downStation) {
        List<String> allStationName = StationRepository.findAllStationName();
        if (allStationName.contains(upStation) && allStationName.contains(downStation)) {
            return true;
        }
        ErrorOutput.printLineStationError();
        return false;
    }

    public static boolean isValidatedDeleteLineName(String lineName) {
        List<String> lineNameList = LineRepository.findAllLineName();
        if (lineNameList.contains(lineName)) {
            return true;
        }
        ErrorOutput.printLineDeleteError();
        return false;
    }
}
