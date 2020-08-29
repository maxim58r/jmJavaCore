package ru.max.lsn2_2_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(charExpression(1));
        int d = 6;
        long b = d;
        float m = b;
        char z ='7';
        Character t = z;
        float e = b;
        byte h = 4;
        char y = '7';
        String u = "6";
        int q = y;
    }

    public static char charExpression(int a) {
            return (char) ( a + '\\');
        }
    }