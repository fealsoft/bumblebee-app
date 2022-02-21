package bumblebeeapp.common.entities.words;

public enum GrammaticalGender {

    NONE("none"),
    MALE("male"),
    FEMALE("female"),
    NEUTER("neuter"),
    PLURAL("plural"),
    MALE_AND_FEMALE("male_and_female");

    private String text;

    GrammaticalGender(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
