package subway;

import subway.config.Config;
import subway.controller.MainController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Config.dataInit();
        MainController.run(scanner);


        // TODO: 프로그램 구현
    }
}
