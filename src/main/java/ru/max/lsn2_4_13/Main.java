package ru.max.lsn2_4_13;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(45));
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(20));

    }

    public static BigInteger factorial(int value) {
        BigInteger m = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            BigInteger h = BigInteger.valueOf(i);
            m = m.multiply(h);
        }
        return m;
    }
}

