package subway.type;

public enum SelectionGuideMention {

    GUIDE_CHOOSE_MENTION("## 원하는 기능을 선택하세요.\n");

    private final String text;

    SelectionGuideMention(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
