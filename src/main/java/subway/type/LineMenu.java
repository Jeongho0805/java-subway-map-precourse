package subway.type;

public enum LineMenu {

    LINE_SCREEN("## 노선 관리 화면\n"),

    LINE_REGISTER("1. 노선 등록\n"),

    LINE_DELETE("2. 노선 삭제\n"),

    LINE_SHOW("3. 노선 조회\n"),

    Line_BACK("B. 돌아가기\n\n"),

    LINE_REGISTER_GUIDE("## 등록할 노선 이름을 입력하세요.\n"),

    LINE_FIRST_STATION_GUIDE("## 등록할 노선의 상행 종점역 이름을 입력하세요.\n"),

    LINE_LAST_STATION_GUIDE("## 등록할 노선의 하행 종점역 이름을 입력하세요.\n"),

    LINE_DELETE_GUIDE("## 삭제할 노선 이름을 입력하세요.\n"),

    LINE_SHOW_SCREEN("## 노선 목록\n")


    ;

    private final String text;

    LineMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
