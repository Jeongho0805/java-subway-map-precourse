package subway.controller;

import subway.service.LineService;
import subway.service.StationService;
import subway.validation.LineValidation;
import subway.validation.StationValidation;
import subway.view.input.LineInput;
import subway.view.output.ErrorOutput;
import subway.view.output.LineOutput;

import java.util.Scanner;

public class LineController {

    public static void run(Scanner sc) {
        while (true) {
            LineOutput.printLineMenu();
            String input = LineInput.scanLineInput(sc);

            if (choose(input, sc)) {
                break;
            }
        }
    }

    private static boolean choose(String input, Scanner sc) {
        if (LineValidation.isValidatedLineSelection(input)) {
            return LineService.activateSelection(input, sc);
        }
        if (LineValidation.isBackSelection(input)) {
            return true;
        }
        ErrorOutput.printSelectionError();
        return false;
    }

}
