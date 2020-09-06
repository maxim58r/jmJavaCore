package ru.max.lsn3_5_7;

public class SpamAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
