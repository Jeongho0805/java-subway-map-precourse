package subway.view.output;

import subway.type.SectionMenu;

public class SectionOutput {

    public static void printSectionMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionMenu.SECTION_SCREEN.getText())
                .append(SectionMenu.SECTION_REGISTER.getText())
                .append(SectionMenu.SECTION_DELETE.getText())
                .append(SectionMenu.SECTION_BACK.getText());
        System.out.print(sb);
    }
}
