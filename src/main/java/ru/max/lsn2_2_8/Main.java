package ru.max.lsn2_2_8;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(0b111 & 0b110));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(0));

//        System.out.println(isPowerOfTwo(1));
//        System.out.println(isPowerOfTwo(-2));
//        System.out.println(isPowerOfTwo(-6));
//        System.out.println(isPowerOfTwo(-8));
//        System.out.println(isPowerOfTwo(32));
//        System.out.println(isPowerOfTwo(-1024));
//        System.out.println(isPowerOfTwo(7));
    }

    public static boolean isPowerOfTwo(int value) {
        int j = Math.abs(value);
//       String i = Integer.toBinaryString(Integer.parseInt(String.valueOf(j)));
        System.out.println(j);
        String i = Integer.toBinaryString(j);
        System.out.println(i);
        return true;
    }
}
