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
        int temp = 0;
        int[] arrTemp = new int[number];
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                arrTemp[i] = i;
                count++;
            }
        }
        int[] arr = new int[count];
        return arr;
    }
}
