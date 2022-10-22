package subway.view.output;

import subway.type.MainMenu;

public class MainOutput {

    public static void printMainMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append(MainMenu.MAIN_SCREEN.getText())
                .append(MainMenu.MAIN_STATION.getText())
                .append(MainMenu.MAIN_LINE.getText())
                .append(MainMenu.MAIN_SECTION.getText())
                .append(MainMenu.MAIN_TOTAL.getText())
                .append(MainMenu.MAIN_QUIT.getText());
        System.out.print(sb);
    }
}
