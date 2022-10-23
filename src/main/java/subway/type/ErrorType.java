package subway.type;

public enum ErrorType {

    ERROR("[ERROR]"),

    DOUBLE_ENTER("\n\n"),

    WRONG_SELECTION(ERROR.getText() + " 선택할 수 없는 기능입니다." + DOUBLE_ENTER.getText()),

    STATION_DUPLICATED_ERROR(ERROR.getText() + " 이미 등록 되어 있는 역입니다." + DOUBLE_ENTER.getText()),

    STATION_LENGTH_ERROR(ERROR.getText() + " 역 이름은 최소 2글자 이상이여야 합니다." + DOUBLE_ENTER.getText()),

    STATION_LASTWORD_ERROR(ERROR.getText() + " 마지막 글자는 '역'으로 끝나야 합니다." + DOUBLE_ENTER.getText()),

    STATION_NOEXIST_ERROR(ERROR.getText() + " 해당 역은 등록되어 있지 않은 역입니다." + DOUBLE_ENTER.getText()),

    STATION_SECTION_CONTAIN_ERROR(ERROR.getText() + " 해당 역은 이미 노선에 등록 된 역입니다." + DOUBLE_ENTER.getText()),

    LINE_DUPLICATED_ERROR(ERROR.getText() + " 이미 등록 되어 있는 노선입니다." + DOUBLE_ENTER.getText()),

    LINE_LENGTH_ERROR(ERROR.getText() + " 노선 이름은 최소 2글자 이상이어야 합니다." + DOUBLE_ENTER.getText()),

    LINE_LASTWORD_ERROR(ERROR.getText() + " 마지막 글자는 '선'으로 끝나야 합니다." + DOUBLE_ENTER.getText()),

    LINE_STATION_ERROR(ERROR.getText() + " 상행 종점역과 하행 종점역은 등록 된 역이어야 합니다." + DOUBLE_ENTER.getText()),

    LINE_DELETE_ERROR(ERROR.getText() + " 삭제하려는 노선은 등록되어 있는 노선이어야 합니다." + DOUBLE_ENTER.getText()),

    SECTION_NOEXIST_LINE_ERROR(ERROR.getText() + " 동록되어 있지 않은 노선입니다.." + DOUBLE_ENTER.getText()),

    SECTION_ADD_STATION_ERROR(ERROR.getText() + " 등록되어 있지 않은 역의 구간 등록은 불가합니다." + DOUBLE_ENTER.getText()),

    SECTION_ALREADY_REGISTER_ERROR(ERROR.getText() + " 노선에 이미 등록된 역이므로 중복 등록이 불가합니다.." + DOUBLE_ENTER.getText()),

    SECTION_BOUNDARY_ERROR(ERROR.getText() + " 순서는 노선에 등록 된 역의 갯수 +1 까지 가능합니다." + DOUBLE_ENTER.getText()),

    SECTION_DELETE_STATION_ERROR(ERROR.getText() + " 노선에 등록되어있지 않은 역이므로 삭제가 불가합니다." + DOUBLE_ENTER.getText());






    private final String text;

    ErrorType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
