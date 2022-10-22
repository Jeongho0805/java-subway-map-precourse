package subway.type;

import java.util.ArrayList;

public enum InputType {

    ONE("1"),

    TWO("2"),

    THREE("3"),

    FOUR("4"),

    QUIT("Q"),

    BACK("B");

    private final String text;

    InputType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
