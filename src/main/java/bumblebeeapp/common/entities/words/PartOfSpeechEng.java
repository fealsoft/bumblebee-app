package bumblebeeapp.common.entities.words;


public enum PartOfSpeechEng {

    NOUN("Noun"),
    VERB("Verb"),
    ADJECTIVE("Adjective"),
    CARDINAL_NUMBER("Cardinal number"),
    PROPER_NOUN("Proper noun"),
    PRONOUN_PERSONAL("Pronoun personal"),
    DETERMINER("Determiner"),
    ADVERB("Adverb"),
    CONJUNCTION("Conjunction"),
    PREPOSITION("Preposition"),
    MODAL_VERB("Modal verb"),
    EXCLAMATION("Exclamation"),
    PRONOUN_POSSESSIVE("Pronoun possessive"),
    PRONOUN_DEMONSTRATIVE("Pronoun demonstrative");


    private String text;

    PartOfSpeechEng(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
