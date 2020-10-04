package ru.max.lsn7_1_8;

public class Main {
    public static void main(String[] args) {
        double i = -7;
        System.out.println(getGenerator().cond(i));
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return arg -> arg.intValue() > 0;
    }
}
