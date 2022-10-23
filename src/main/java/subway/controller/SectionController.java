package subway.controller;

import subway.service.SectionService;
import subway.service.StationService;
import subway.type.InputType;
import subway.validation.SectionValidation;
import subway.validation.StationValidation;
import subway.view.input.SectionInput;
import subway.view.input.StationInput;
import subway.view.output.ErrorOutput;
import subway.view.output.SectionOutput;
import subway.view.output.StationOutput;

import java.util.Scanner;

public class SectionController {

    public static void run(Scanner sc) {
        while (true) {
            SectionOutput.printSectionMenu();
            String input = SectionInput.scanSectionInput(sc);

            if (choose(input, sc)) {
                break;
            }
        }
    }

    private static boolean choose(String input, Scanner sc) {
        if (SectionValidation.isValidatedSectionSelection(input)) {
            return SectionService.activateSelection(input, sc);
        }
        if (SectionValidation.isBackSelection(input)) {
            return true;
        }
        ErrorOutput.printSelectionError();
        return false;
    }
}

