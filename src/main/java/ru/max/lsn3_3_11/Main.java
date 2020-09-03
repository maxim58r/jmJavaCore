package ru.max.lsn3_3_11;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
//      Dog dog = new Dog();
      Dog.catchCat();
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public static void sayHello() {
            System.out.println("Гав!");
        }

        public static void catchCat() {
            System.out.println("Кошка поймана");
            sayHello();
            new Cat().sayHello();
        }
    }
}
