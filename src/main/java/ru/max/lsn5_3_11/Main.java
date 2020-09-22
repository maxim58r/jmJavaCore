package ru.max.lsn5_3_11;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
//        String st = new String(inputStream.readAllBytes(),charset);
        int i;
        StringBuilder str = new StringBuilder();
        try (InputStreamReader br = new InputStreamReader(inputStream, charset)) {
            while ((i = br.read()) != -1) {
                str.append((char) i);
            }
        }
        return str.toString();
//        return st;
    }
}
