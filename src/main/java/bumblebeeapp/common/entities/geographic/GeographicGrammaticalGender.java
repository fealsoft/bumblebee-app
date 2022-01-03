package bumblebeeapp.common.entities.geographic;

public enum GeographicGrammaticalGender {

    MALE("male"),
    FEMALE("female"),
    NEUTER("neuter"),
    PLURAL("Plural");

    private String text;

    GeographicGrammaticalGender(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
