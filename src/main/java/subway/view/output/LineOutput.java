package subway.view.output;

import subway.repository.LineRepository;
import subway.type.InfoType;
import subway.type.LineMenu;

import java.util.List;

public class LineOutput {

    public static void printLineMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineMenu.LINE_SCREEN.getText())
                .append(LineMenu.LINE_REGISTER.getText())
                .append(LineMenu.LINE_DELETE.getText())
                .append(LineMenu.LINE_SHOW.getText())
                .append(LineMenu.Line_BACK.getText());
        System.out.print(sb);

    }

    public static void printAllLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineMenu.LINE_SHOW_SCREEN.getText());

        List<String> lineNameList = LineRepository.findAllLineName();
        for (String lineName : lineNameList) {
            sb.append(InfoType.INFO+" "+lineName+"\n");
        }
        sb.append("\n");
        System.out.print(sb);
    }
}
