package ru.max.lsn6_1_12;

import java.util.Objects;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);
    }

    public static class Pair<T, V> {
        private final T x;
        private final V y;

        private Pair(T x, V y) {
            this.x = x;
            this.y = y;
        }

        public static <T, V> Pair<T, V> of(T x, V y) {
            return new Pair<>(x, y);
        }

        public T getFirst() {
            return this.x;
        }

        public V getSecond() {
            return this.y;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(x, pair.x) &&
                    Objects.equals(y, pair.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
