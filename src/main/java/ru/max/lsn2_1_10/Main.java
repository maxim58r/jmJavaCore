package ru.max.lsn2_1_10;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(doubleExpression(3.001004, 4.006007, 7.007011));
        System.out.println(doubleExpression(-3.001004, 3.001004, 0.00000001));
        System.out.println(doubleExpression(-14.007004, 7.006007, -7.000997));
        System.out.println(doubleExpression(0.000004, 4.006007, 4.006007));
        System.out.println(doubleExpression(-0.0, 0.0, 0.0));
        System.out.println(doubleExpression(-0.00001001, 0.00000005, -1.5E-7));

        System.out.println(Math.abs(Math.abs(-14.007004 + 7.006007) - Math.abs(-14.007004 - 7.006007)));
        System.out.println(Math.abs(-14.007004 + 7.006007));
        System.out.println(-0.01 - 0.05);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.0001;

    }
}

