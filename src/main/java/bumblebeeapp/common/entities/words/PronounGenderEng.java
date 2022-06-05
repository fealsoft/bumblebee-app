package bumblebeeapp.common.entities.words;


public enum PronounGenderEng {

    NONE("None"),
    MALE("Male"),
    FEMALE("Female");

    private String text;


    PronounGenderEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
