package bumblebeeapp.common.entities.words;


public enum PronounNumberEng {

    SINGULAR("Singular"),
    PLURAL("Plural"),
    SINGULAR_PLURAL("Singular/Plural");

    private String text;


    PronounNumberEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
