package ru.max.lsn6_2_14;

import java.util.*;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
//        1 2 3 4 5 6 7 8 9 10

        Scanner sc = new Scanner(System.in);
//        Deque<Integer> queue = new ArrayDeque<Integer>(sc.());
//        System.out.println(Arrays.toString(queue.toArray()));
        String[] str = sc.nextLine().split("[ ]+");
        Set<Integer> st = new TreeSet<>(Comparator.reverseOrder());
//        st.iterator().forEachRemaining(integer -> );
        int count = 0;
        for (String i : str) {
            count++;
            int j = 0;
            try {
                j = Integer.parseInt(i);
            } catch (NumberFormatException e) {
            }
            if (count % 2 == 0) {
                st.add(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : st) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
