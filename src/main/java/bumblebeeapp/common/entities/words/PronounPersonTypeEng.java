package bumblebeeapp.common.entities.words;


public enum PronounPersonTypeEng {

    SUBJECT("Subject"),
    OBJECT("Object"),
    SUBJECT_OBJECT("Subject/Object");

    private String text;


    PronounPersonTypeEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
