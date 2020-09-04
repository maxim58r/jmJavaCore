package ru.max.lsn3_3_11;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
      Dog dog = new Dog();
      dog.catchCat(cat);
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

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }
}
