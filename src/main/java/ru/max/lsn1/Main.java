package ru.max.lsn1;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(-1));
        System.out.println(isPrime(Integer.MAX_VALUE));
        System.out.println(isPrime(5));
        System.out.println(isPrime(-Integer.MAX_VALUE));
        System.out.println('а');

        ProcessBuilder pb = new ProcessBuilder();
        File file;
        ObjectOutputStream objectOutputStream = null;
//        objectOutputStream.writeObject();
    }

    public static boolean isPrime(int num) {

        if (num > 0) {
            BigInteger bigInteger = BigInteger.valueOf(num);
            return bigInteger.isProbablePrime(num);
        } else return false;
    }
}

