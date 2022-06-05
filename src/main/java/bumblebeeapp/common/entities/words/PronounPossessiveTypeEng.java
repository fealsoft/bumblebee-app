package bumblebeeapp.common.entities.words;

public enum PronounPossessiveTypeEng {

    DETERMINER("Determiner"),
    PRONOUN("Pronoun"),
    DETERMINER_PRONOUN("Determiner Pronoun");

    private String text;


    PronounPossessiveTypeEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
