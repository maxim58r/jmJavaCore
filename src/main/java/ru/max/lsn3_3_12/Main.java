package ru.max.lsn3_3_12;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = new Human((byte) 13, "Max", "Boyko", "Swimming");
        Human h2 = new Human((byte) 13, "Lev", "Ivanoff");

    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {
        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this(age, name, secondName);
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}
