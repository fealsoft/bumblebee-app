package bumblebeeapp.common.entities.words;


public enum PartOfSpeechUkr {

    IMENNIK("Іменник"),
    DIESLOVO("Дієслово"),
    PRIKMETNIK("Прикметник"),
    CHISLIVNIK_KILKISNIY("Числівник кількісний"),
    ZAYMENNIK_PRISVIYNIY("Займенник (присвійний)"),
    ZAYMENNIK_OSOBOVIY("Займенник (особовий)"),
    PRISLIVNIK("Прислівник"),
    SPOLUCHNIK("Сполучник"),
    DIEPRIKMETNIK("Дієприкметник"),
    PRIYMENNIK("Прийменник"),
    VIGUK("Вигук"),
    PRISLIVNIKOVE_SPOLUCHENNYA("Прислівникове сполучення"),
    CHASTKA("Частка"),
    ZAYMENNIK_VKAZIVNIY("Займенник (вказівний)");

    private String text;

    PartOfSpeechUkr(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
