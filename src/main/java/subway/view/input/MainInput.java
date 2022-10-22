package subway.view.input;

import subway.type.SelectionGuideMention;

import java.util.Scanner;

public class MainInput {

    public static String scanMainInput(Scanner sc) {
        System.out.print(SelectionGuideMention.GUIDE_CHOOSE_MENTION.getText());
        String number =  sc.nextLine();
        System.out.println();
        return number;




    }


}
