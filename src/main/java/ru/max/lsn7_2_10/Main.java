package ru.max.lsn7_2_10;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        pseudoRandomStream(13).forEach(System.out::print);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) % 10000) / 10);
    }
}
