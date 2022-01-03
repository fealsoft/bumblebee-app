package bumblebeeapp.common.entities.name;

public enum GenderName {

    MALE("Male"),
    FEMALE("Female"),
    COMMON("Common");

    private String text;

    GenderName(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
