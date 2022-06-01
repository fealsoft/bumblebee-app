package bumblebeeapp.common.entities.words;

public enum PronounDemonstrativeNumberEng {

    SINGULAR("singular"),
    PLURAL("plural");

    private String text;


    PronounDemonstrativeNumberEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
