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
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(Arrays.toString(symmetricDifference(set1, set2).toArray()));

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);

        Set<T> differenceSets = new HashSet<>(set1);
        differenceSets.addAll(set2);
        differenceSets.removeAll(intersect);

        return differenceSets;
    }

}