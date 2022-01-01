package bumblebeeapp.common;

public enum PosTag {

    CC("CC"), // conjunction, coordinating
    CD("CD"), // numeral, cardinal
    DT("DT"), // determiner
    EX("EX"), // existential there
    FW("FW"), // foreign word
    IN("IN"), // preposition or conjunction, subordinating
    JJ("JJ"), // adjective or numeral, ordinal
    JJR("JJR"), // adjective, comparative
    JJS("JJS"), // adjective, superlative
    LS("LS"), // list item marker
    MD("MD"), // modal auxiliary
    NN("NN"), // noun, common, singular or mass
    NNS("NNS"), // noun, common, plural
    NNP("NNP"), // noun, proper, singular
    NNPS("NNPS"), // noun, proper, plural
    PDT("PDT"), // pre-determiner
    POS("POS"), // genitive marker
    PRP("PRP"), // pronoun personal
    PRP$("PRP$"), // pronoun, possessive
    RB("RB"), // adverb
    RBR("RBR"), // adverb, comparative
    RBS("RBS"), // adverb, superlative
    RP("RP"), // particle
    SYM("SYM"), // symbol
    TO("TO"), // "to" as preposition or infinitive marker
    UH("UH"), // interjection
    VB("VB"), // verb, base form
    VBD("VBD"), // verb past tense
    VBG("VBG"), // verb, present participle or gerund
    VBN("VBN"), // verb, past participle
    VBP("VBP"), // verb, present tense, not 3rd person singular
    VBZ("VBZ"), // verb, present tense, 3rd person singular
    WDT("WDT"), // WH-determiner
    WP("WP"), // WH-pronoun
    WP$("WP$"), // WH-pronoun, possessive
    WRB("WRB"), // Wh-adverb
    POINT("."), // point
    COMMA(","), // comma
    LRB("-LRB-"), // (
    RRB("-RRB-"), // )
    UNDEFINED("");

    private final String text;

    PosTag(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static PosTag fromString(String text) {
        for (PosTag posTag : PosTag.values()) {
            if (posTag.text.equalsIgnoreCase(text)) {
                return posTag;
            }
        }
        return PosTag.UNDEFINED;
    }
}
