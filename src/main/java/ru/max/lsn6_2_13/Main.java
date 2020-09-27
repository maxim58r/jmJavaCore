package ru.max.lsn6_2_13;

import java.util.*;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new LinkedHashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        System.out.println(Arrays.toString(symmetricDifference(set1, set2).toArray()));

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Collection<T> st = new ArrayList<T>();
        st.addAll(set1);
        st.addAll(set2);
        Set<T> set = new TreeSet<>();
        for (var i : set1) {
            if (set2.contains(i)) {
                set.add(i);
            }
        }
        for (var i : set2) {
            if (set1.contains(i)) {
                set.add(i);
            }
        }
        return set;
    }

}