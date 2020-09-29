package ru.max.lsn6_2_14;

import java.util.*;

/**
 * @author Serov Maxim
 */

//        1 2 3 4 5 6 7 8 9 10
public class Main {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextInt()) {
            count++;
            int i = sc.nextInt();
            if (count % 2 == 0) {
                dq.addFirst(i);
            }
        }
        for (int j : dq) {
            System.out.print(j + " ");
        }
    }
}