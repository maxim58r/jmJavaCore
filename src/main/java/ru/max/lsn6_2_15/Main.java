package ru.max.lsn6_2_15;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("C:\\Users\\400103\\IdeaProjects\\jmJavaCore\\src\\main\\java\\ru\\max\\lsn6_2_15\\text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        getSalesMap(reader).forEach((v, k) -> System.out.println(v + k));
    }

    /*Алексей 3000
    Дмитрий 9000
    Антон 3000
    Алексей 7000
    Антон 8000*/

    public static Map<String, Long> getSalesMap(Reader reader) {
        Scanner sc = new Scanner(reader);
        Map<String, Long> map = new HashMap<>();
        while (sc.hasNextLine()) {
            String[] str = sc.nextLine().split(" ");
            map.merge(str[0], Long.parseLong(str[1]), Long::sum);
        }
        return map;
    }
}
