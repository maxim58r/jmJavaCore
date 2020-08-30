package ru.max.lsn2_4_14;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(0));
        factorial(45);
        factorial(0);
        factorial(20);

    }

    public static BigInteger factorial(int value) {
        BigInteger fact;
        if (value == 1 || value == 0) {
           return BigInteger.ONE;
        }
       fact = factorial(value - 1).multiply(BigInteger.valueOf(value));
        return fact;
    }
}

