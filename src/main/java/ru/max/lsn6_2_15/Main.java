package ru.max.lsn6_2_15;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("C:\\Users\\400103\\IdeaProjects\\jmJavaCore\\src\\main\\java\\ru\\max\\text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(getSalesMap(reader));
    }

    /*Алексей 3000
    Дмитрий 9000
    Антон 3000
    Алексей 7000
    Антон 8000*/

    public static Map<String, Long> getSalesMap(Reader reader) {
        Scanner sc = new Scanner(reader);
        while (sc.hasNextLine()) {
            String[]  str = sc.nextLine().split(" ");
            Map<String,Long> map = new HashMap<>();
            map.merge( );
            for (var i : str) {
                System.out.print(i);
            }
            System.out.println();
            Map<String, Long> mp = new LinkedHashMap<>();
        }
        String s;
        s.concat()

        return new HashMap<>();
    }
}
