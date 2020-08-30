package ru.max.lsn2_4_15;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.determineGroup(0));
        System.out.println(m.determineGroup(10));
        System.out.println(m.determineGroup(60));
        System.out.println(m.determineGroup(77));
    }

    public int determineGroup(int age) {
        int numGroup = -1;
        if (age >= 7 && age <= 13) {
            numGroup = 1;
        }
        if (age >= 14 && age <= 17) {
            numGroup = 2;
        }
        if (age >= 18 && age <= 65) {
            numGroup = 3;
        }
        return numGroup;
    }
}
