package ru.max.lsn2_1_11;

public class Main {
    public static void main(String[] args) {
        System.out.println(drawisMonitorsCounter(11, 5));
    }

    public static int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
}
