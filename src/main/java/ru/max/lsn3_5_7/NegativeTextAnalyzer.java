package ru.max.lsn3_5_7;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    @Override
    String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
