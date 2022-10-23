package subway.controller;

import subway.service.TotalPrintService;
import subway.view.output.StationOutput;

import java.util.Scanner;

public class TotalPrintController {

    public static void run() {

        TotalPrintService.printTotalSubwayList();
    }
}
