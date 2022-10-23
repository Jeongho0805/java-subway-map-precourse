package subway.type;

public enum TotalPrintMenu {

    TOTAL_PRINT_SCREEN("## 지하철 노선도\n"),

    TOTAL_PRINT_SPLIT_LINE(InfoType.INFO.getText() + " ---\n")

    ;

    private final String text;

    TotalPrintMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
