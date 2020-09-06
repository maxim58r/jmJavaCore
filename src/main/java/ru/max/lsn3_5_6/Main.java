package ru.max.lsn3_5_6;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = {'e', 'r', 'r', 'o', 'r', '5', 120, -128, 127, 0};
        AsciiCharSequence acs = new AsciiCharSequence(bytes);
        System.out.println(acs.length());
        System.out.println(acs.charAt(4));
        System.out.println(acs.subSequence(1, 5));
        System.out.println(acs.toString());
    }

    public static class AsciiCharSequence implements CharSequence {
        private final byte[] bytes;

        public AsciiCharSequence(byte[] bytes) {
            this.bytes = bytes;
        }

        @Override
        public int length() {
            return bytes.length;
        }

        @Override
        public char charAt(int index) {
            return (char) bytes[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] bt = new byte[end - start];
            int count = 0;
            for (int i = start; i < end; i++) {
                bt[count++] = bytes[i];
            }
            return new AsciiCharSequence(bt);
        }

        @Override
        public String toString() {
            return new String(bytes);
        }
    }
}
