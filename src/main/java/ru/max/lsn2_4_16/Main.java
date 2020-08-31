package ru.max.lsn2_4_16;

import java.util.Arrays;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(Arrays.toString(m.evenArray(8)));
    }

    public int[] evenArray(int number) {
        int count = 0;
        int[] arr = new int[number / 2];
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }
}