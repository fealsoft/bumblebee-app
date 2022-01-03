package bumblebeeapp.common.entities.geographic;

public enum GeographicType {

    OTHER("other"),
    COUNTRY("country"),
    CITY("city"),
    CONTINENT("continent"),
    STATE_OF_USA("state of USA"),
    MUNICIPALITY("municipality"),
    PLANET("planet"),
    RIVER("river");

    private String text;

    GeographicType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
