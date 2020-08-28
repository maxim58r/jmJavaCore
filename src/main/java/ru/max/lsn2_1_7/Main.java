package ru.max.lsn2_1_7;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        char n = '\u4532';
        System.out.println(n);
        System.out.println(priceCalculation(8.50, 2));
    }

    public static double priceCalculation(double price, int count) {
        return price * count;
    }
}