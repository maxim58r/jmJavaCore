package ru.max.lsn3_5_7;

public class Main {
    public static void main(String[] args) {
        String[] keywords = {"null", "tyr"};
        TextAnalyzer sa = new SpamAnalyzer(keywords);
        TextAnalyzer nta = new NegativeTextAnalyzer();
        TextAnalyzer tla = new TooLongTextAnalyzer(27);
        TextAnalyzer[] analyzers = {sa, nta, tla};

        String text = "null etrewur klj ";
        String text1 = "=) etrewur klj :( jhxsgf";
        String text2 = "etrewur klj  jhxsgfjgf jkfhkss jhasfdfjhskjf fhFH ";
        String text3 = "etrewur klj  jhxsgfjgf";

        Main main = new Main();
        System.out.println(main.checkLabels(analyzers, text));
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer textAnalyzer : analyzers) {
            if (!textAnalyzer.processText(text).equals(Label.OK)) {
               return textAnalyzer.processText(text);
            }
        }
        return Label.OK;
    }
}
