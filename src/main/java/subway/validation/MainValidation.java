package subway.validation;

import subway.type.InputType;

import java.util.ArrayList;

public class MainValidation {

    public static boolean isValidatedSelection(String input) {
        ArrayList<String> inputNumberList = getNumberList();
        return inputNumberList.contains(input);
    }

    public static boolean isQuitSelection(String input) {
        return input.equals(InputType.QUIT.getText());
    }

    public static ArrayList<String> getNumberList() {
        ArrayList<String> inputNumberList = new ArrayList<>();
        inputNumberList.add(InputType.ONE.getText());
        inputNumberList.add(InputType.TWO.getText());
        inputNumberList.add(InputType.THREE.getText());
        inputNumberList.add(InputType.FOUR.getText());
        return inputNumberList;
    }
}
