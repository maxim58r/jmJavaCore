package ru.max.lsn5_2_8;

import java.io.*;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{5, 12, -8, 43, 3, 10, 4, 5, 7});
        OutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int b;
        while ((b = inputStream.read()) != -1) {
            if ((byte) b % 2 == 0) {
                try {
                    outputStream.write(b);
                } finally {
                    outputStream.close();
                }
            }
        }
    }
}