package ru.max.lsn6_2_14;

import java.util.*;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        Set<Integer> st = new  TreeSet<>();

        for (var i : str) {
           var j = Integer.parseInt(i);
            if (j % 2 == 0) {
                st.add(j);
            }
        }
        Spliterator<Integer> integerSpliterator = st.spliterator();
        integerSpliterator;
        System.out.println(st);
    }
}
