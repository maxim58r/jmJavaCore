package ru.max.lsn4_2_7;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
        }
    }

    public static class Car implements AutoCloseable {
        public void close() {
            System.out.println("Машина закрывается...");
        }

        void drive() {
            System.out.println("Машина поехала.");
        }
    }
}
