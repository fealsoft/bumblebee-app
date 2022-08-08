package bumblebeeapp.common.entities.words;


public enum PronounPersonEng {

    FIRST("First person"),
    SECOND("Second person"),
    THIRD("Third person");

    private String text;


    PronounPersonEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
