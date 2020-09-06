package ru.max.lsn3_5_7;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    @Override
    public Label processText(String text) {
        Label lbl = null;
        String[] st = text.split(" ");
        for (String str : st) {
            for (String kw : getKeywords()) {
                if (str.equals(kw)) {
                    return getLabel();
                }
            }
        }
        return Label.OK;
    }

    @Override
    String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
