package ru.max.lsn5_2_7;

import java.io.*;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{/*5, 12, -8, 43,*/ 1, 'n'});
        //System.out.println(sumOfStream(inputStream));
        sumOfStream(inputStream);
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int l = 0;
        int b;
        while ((b = inputStream.read()) != -1) {
            l += (byte) b;
        }
        inputStream.close();
        return l;
    }
}
