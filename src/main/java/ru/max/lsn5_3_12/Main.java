package ru.max.lsn5_3_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sumRealNumber();
    }

    public static void sumRealNumber() {
        double dbl = 0;
        var sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] str = sc.nextLine().split(" ");
            for (var d : str) {
                try {
                    dbl += Double.parseDouble(d);
                } catch (NumberFormatException nfe) {

                }
            }
        }
        System.out.printf("%.6f", dbl);
    }
}
