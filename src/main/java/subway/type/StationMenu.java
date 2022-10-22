package subway.type;

public enum StationMenu {
    STATION_SCREEN("## 역 관리 화면\n"),

    STATION_ALL_SCREEN("## 역 목록\n"),

    STATION_REGISTER("1. 역 등록\n"),

    STATION_DELETE("2. 역 삭제\n"),

    STATION_SHOW("3. 역 조회\n"),

    STATION_BACK("B. 돌아가기\n\n"),

    STATION_REGISTER_GUIDE("## 등록할 역 이름을 입력하세요.\n"),

    STATION_DELETE_GUIDE("## 삭제할 역 이름을 입력하세요.\n");

    private final String text;

    StationMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
