package subway.controller;

import subway.service.StationService;
import subway.validation.StationValidation;
import subway.view.input.StationInput;
import subway.view.output.ErrorOutput;
import subway.view.output.StationOutput;

import java.util.Scanner;

public class StationController {

    public static void run(Scanner sc) {
        while (true) {
            StationOutput.printStationMenu();
            String input = StationInput.scanStationInput(sc);

            if (choose(input, sc)) {
                break;
            }
        }
    }
    private static boolean choose(String input, Scanner sc) {
        if (StationValidation.isValidatedStationSelection(input)) {
            return StationService.activateSelection(input, sc);
        }
        if (StationValidation.isBackSelection(input)) {
            return true;
        }
        ErrorOutput.printSelectionError();
        return false;
    }
}
