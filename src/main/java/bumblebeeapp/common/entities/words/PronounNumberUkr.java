package bumblebeeapp.common.entities.words;

public enum PronounNumberUkr {

    SINGULAR("singular"),
    PLURAL("plural");

    private String text;


    PronounNumberUkr(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
