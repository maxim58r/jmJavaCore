package ru.max.lsn4_2_7;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        try() {

        }
    }

    static class Car {
        void close() {
            System.out.println("Машина закрывается...");
        }

        void drive() {
            System.out.println("Машина поехала.");
        }
    }
}
