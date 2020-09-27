package ru.max.lsn6_1_11;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {

    }

    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<>();
        }
    }
}
