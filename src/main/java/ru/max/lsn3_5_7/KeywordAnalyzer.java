package ru.max.lsn3_5_7;

public abstract class KeywordAnalyzer implements TextAnalyzer  {
    abstract String[] getKeywords();

    abstract Label getLabel();

    @Override
    public Label processText(String text) {
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
}
