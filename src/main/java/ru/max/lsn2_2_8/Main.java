package ru.max.lsn2_2_8;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
//        isPowerOfTwo(-16);
//        isPowerOfTwo(0b0111 ^ 0b1010);
//        isPowerOfTwo(0b0111 & 0b1010);
//        isPowerOfTwo(0b0101 | 0b1100);
        String a = "A" + ('\t' + '\u0003');
        String b = '1'+ '3' + "2";
        String c = "A" + 12;
        String d = 'A' + "12";
        System.out.println(a + " " + b + " " + c + " " + d + " ");
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(-8));
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(-1024));
        System.out.println(isPowerOfTwo(7));
    }

    public static boolean isPowerOfTwo(int value) {
//        int j = Math.abs(value);
//        String i = Integer.toBinaryString(j).replace("0", "");
//        if (i.equals(""))
//            return false;
//        int d = Integer.parseInt(i);
//        return d == 1;
        return Integer.bitCount(Math.abs(value)) == 1;
//        return Integer.toBinaryString(Math.abs(value)).replace("0", "").equals("1");
    }
}
