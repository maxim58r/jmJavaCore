package ru.max.lsn3_5_7;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    public TooLongTextAnalyzer(int mexLength) {
        this.maxLength = mexLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() >= maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
