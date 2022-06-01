package bumblebeeapp.common.entities.words;

public enum PronounGenderUkr {

    NONE("none"),
    MALE("male"),
    FEMALE("female"),
    NEUTER("neuter");

    private String text;


    PronounGenderUkr(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
