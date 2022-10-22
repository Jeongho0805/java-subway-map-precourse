package subway.type;

public enum MainMenu {

    MAIN_SCREEN("## 메인 화면\n"),
    MAIN_STATION("1. 역 관리\n"),
    MAIN_LINE("2. 노선 관리\n"),
    MAIN_SECTION("3. 구간 관리\n"),
    MAIN_TOTAL("4. 지하철 노선도 출력\n"),
    MAIN_QUIT("Q. 종료\n\n");

    private final String text;

    MainMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
