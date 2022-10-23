package subway.controller;

import subway.type.InputType;
import subway.validation.MainValidation;
import subway.view.input.MainInput;
import subway.view.output.ErrorOutput;
import subway.view.output.MainOutput;

import java.util.Scanner;

public class MainController {

    public static void run(Scanner sc) {
        while (true) {
            MainOutput.printMainMenu();
            String input = MainInput.scanMainInput(sc);

            if (MainValidation.isValidatedSelection(input)) {
                choose(input, sc);
                continue;
            }
            if (MainValidation.isQuitSelection(input)) {
                break;
            }
            ErrorOutput.printSelectionError();
        }
    }

    public static void choose(String input, Scanner scanner) {
        if (input.equals(InputType.ONE.getText())) {
            StationController.run(scanner);
        }
        if (input.equals(InputType.TWO.getText())) {
            LineController.run(scanner);
        }
        if (input.equals(InputType.THREE.getText())) {
            SectionController.run(scanner);
        }
        if (input.equals(InputType.FOUR.getText())) {
            TotalPrintController.run();
        }
    }
}
