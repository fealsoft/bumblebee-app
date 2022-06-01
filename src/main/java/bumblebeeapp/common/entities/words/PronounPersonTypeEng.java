package bumblebeeapp.common.entities.words;


public enum PronounPersonTypeEng {

    SUBJECT("subject"),
    OBJECT("object"),
    SUBJECT_OBJECT("subject/object");

    private String text;


    PronounPersonTypeEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
