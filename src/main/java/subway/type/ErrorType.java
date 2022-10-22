package subway.type;

public enum ErrorType {

    ERROR("[ERROR]"),

    WRONG_SELECTION(ERROR.getText() + " 선택할 수 없는 기능입니다.\n\n"),

    STATION_DUPLICATED_ERROR(ERROR.getText() + " 이미 등록 되어 있는 역입니다.\n\n"),

    STATION_LENGTH_ERROR(ERROR.getText() + " 역 이름은 최소 2글자 이상이여야 합니다.\n\n"),

    STATION_LASTWORD_ERROR(ERROR.getText() + " 마지막 글자는 '역'으로 끝나야 합니다.\n\n"),

    STATION_NOEXIST_ERROR(ERROR.getText() + " 해당 역은 등록되어 있지 않은 역입니다.\n\n"),

    STATION_SECTION_CONTAIN_ERROR(ERROR.getText() + " 해당 역은 이미 노선에 등록 된 역입니다.\n\n");

    private final String text;

    ErrorType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
