package bumblebeeapp.common.entities.words;

public enum PronounTypeEng {

    SUBJECT("Subject"),
    OBJECT("Object"),
    SUBJECT_OBJECT("Subject/Object");

    private String text;


    PronounTypeEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
