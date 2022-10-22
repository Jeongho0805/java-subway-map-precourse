package subway.type;

public enum InfoType {

    INFO("[INFO]"),

    STATION_REGISTER_INFO(INFO.getText() + " 지하철 역이 등록되었습니다.\n\n"),

    STATION_DELETE_INFO(INFO.getText() + " 지하철 역이 삭제되었습니다.\n\n");

    private final String text;

    InfoType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
