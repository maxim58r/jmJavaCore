package ru.max.lsn2_4_18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {0, 2, 2};
        int[] b = {1, 3};
        int[] c = {};
        int[] d = {1, 3, 5};

        System.out.println(Arrays.toString(mergeArrays(a, b))); // [0, 1, 2, 2, 3]
        System.out.println(Arrays.toString(mergeArrays(c, d))); // [1, 3, 5]
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a1.length && j < a2.length) {
            a3[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
        }

        if (j == a2.length) {
            System.arraycopy(a1, 0, a3, 0, a1.length - 1);
        } else if (i == a1.length) {
            System.arraycopy(a2, 0, a3, 0, a1.length - 1);
        } else if (i < a1.length) {
            System.arraycopy(a1, i, a3, k, a1.length - i);
        } else if (j < a2.length) {
            System.arraycopy(a2, j, a3, k, a2.length - j);
        }
        return a3;
        /*for (int k = 0; k < a3.length; k++) {
            if (a1.length - 1 < i) {
                int temp = a2[j];
                a3[k] = temp;
                j++;
            }
            if (a2.length - 1 < j) {
                int temp = a1[i];
                a3[k] = temp;
                i++;
            }
            if (a1[i] < a2[j]) {
                int temp = a1[i];
                a3[k] = temp;
                i++;
            } else {
                int temp = a2[j];
                a3[k] = temp;
                j++;
            }
        }*/
    }
}
