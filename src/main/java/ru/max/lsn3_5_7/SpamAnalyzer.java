package ru.max.lsn3_5_7;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        String[] st = text.split(" ");
        for (String str : st) {
            for (String kw : getKeywords()) {
                if (str.equals(kw)) {
                    return Label.SPAM;
                }
            }
        }
        return Label.OK;
    }

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.SPAM;
    }
}
