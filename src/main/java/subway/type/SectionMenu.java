package subway.type;

public enum SectionMenu {

    SECTION_SCREEN("## 구간 관리 화면\n"),

    SECTION_REGISTER("1. 구간 등록\n"),

    SECTION_DELETE("2. 구간 삭제\n"),

    SECTION_BACK("B. 돌아가기\n\n"),

    SECTION_LINE_REGISTER("## 노선을 입력하세요.\n"),

    SECTION_STATION_REGISTER("## 역 이름을 입력하세요.\n"),

    SECTION_ORDER_REGISTER("## 순서를 입력하세요.\n"),

    SECTION_LINE_DELETE("## 삭제할 구간의 노선을 입력하세요.\n"),

    SECTION_STATION_DELETE("## 삭제할 구간의 역을 입력하세요.\n")

    ;


    private final String text;

    SectionMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
