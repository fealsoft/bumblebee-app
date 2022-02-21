package bumblebeeapp.common.entities.words;

public enum GrammaticalAnimacy {

    NONE("none"),
    ANIMATE("animate"),
    INANIMATE("inanimate");

    private String text;

    GrammaticalAnimacy(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
