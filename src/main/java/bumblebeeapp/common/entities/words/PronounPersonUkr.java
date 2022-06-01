package bumblebeeapp.common.entities.words;


public enum PronounPersonUkr {

    FIRST("First person"),
    SECOND("Second person"),
    THIRD("Third person");

    private String text;


    PronounPersonUkr(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
