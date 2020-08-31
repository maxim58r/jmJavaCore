package ru.max.lsn2_4_17;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 20, 8, 7, 3, 100}; //    Пример вывода: 3,5,7,3
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sb.append(arr[i]);
                sb.append(",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}