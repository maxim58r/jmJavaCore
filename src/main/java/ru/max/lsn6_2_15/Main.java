package ru.max.lsn6_2_15;

import java.io.*;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Reader rd;
    }

    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            while (reader.read() != -1) {
                sb.append(reader.read());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str;
//        str.getChars();
        return new HashMap<>();
    }
}
