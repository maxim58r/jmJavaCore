package ru.max.lsn2_3_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String tmp = " Was it a cat I saw? ";
        System.out.println(isPalindrome(tmp));
    }

    public static boolean isPalindrome(String text) {
        String[] st = text.split("[^a-zA-Z0-9]");
        String stJoin = String.join("", st);
        String revSt = new StringBuilder(stJoin).reverse().toString();
        return stJoin.equalsIgnoreCase(revSt);
    }
}
