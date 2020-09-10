package ru.max.lsn3_5_7;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
            for (String kw : getKeywords()) {
                if (text.lastIndexOf(kw) >= 0) {
                    return getLabel();
            }
        }
        return Label.OK;
    }
}
