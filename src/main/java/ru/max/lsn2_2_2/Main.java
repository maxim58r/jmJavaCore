package ru.max.lsn2_2_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(charExpression(1));
    }

    public static char charExpression(int a) {
            return (char) ( a + '\\');
        }
    }