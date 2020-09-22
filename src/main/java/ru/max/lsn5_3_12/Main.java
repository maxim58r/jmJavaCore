package ru.max.lsn5_3_12;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
/*Пример ввода 1: 1 2 3
Пример вывода 1: 6.000000

Пример ввода 2: a1 b2 c3
Пример вывода 2: 0.000000

Пример ввода 3:  -1e3 18 .111 11bbb
Пример вывода 3: -981.889000

Требования:
1. Программа должна читать текст из System.in
2. Программа должна выводить число с точностью до 6 знака после запятой*/
        System.out.println(sumRealNumber());
    }

    public static double sumRealNumber() throws IOException {
        int b;
        InputStreamReader is = new InputStreamReader(System.in);
        while ((b = is.read()) != -1) {
//            DataInput dis = new DataInputStream();
            is.read();
            System.out.println(b);


        }
        return 1.1;
    }
}
