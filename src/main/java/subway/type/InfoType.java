package subway.type;

public enum InfoType {

    INFO("[INFO]"),

    DOUBLE_ENTER("\n\n"),

    STATION_REGISTER_INFO(INFO.getText() + " 지하철 역이 등록되었습니다." + DOUBLE_ENTER.getText()),

    STATION_DELETE_INFO(INFO.getText() + " 지하철 역이 삭제되었습니다" + DOUBLE_ENTER.getText()),

    LINE_REGISTER_INFO(INFO.getText() + " 지하철 노선이 등록되었습니다." + DOUBLE_ENTER.getText()),

    LINE_DELETE_INFO(INFO.getText() + " 지하철 노선이 삭제되었습니다." + DOUBLE_ENTER.getText()),

    SECTION_REGISTER_INFO(INFO.getText() + " 구간이 등록되었습니다." +  DOUBLE_ENTER.getText()),

    SECTION_DELETE_INFO(INFO.getText() + " 구간이 삭제되었습니다." + DOUBLE_ENTER.getText());

    private final String text;

    InfoType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
