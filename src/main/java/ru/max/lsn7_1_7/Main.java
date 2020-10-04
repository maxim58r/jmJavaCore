package ru.max.lsn7_1_7;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
    }

    public UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }
}
