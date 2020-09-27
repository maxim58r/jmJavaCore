package ru.max.lsn6_1_13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        DynamicArray<String> da = new DynamicArray<>();
        String str = "Hello";
        String str1 = "gd";
        String str2 = "He13llo";
        String str3 = "uihg";
        String str4 = "Heregllo";
        String str5 = "grd";
        String str6 = "46He163llo";
        String str7 = "fsehehd";
        da.add(str);
        da.add(str1);
        da.add(str2);
        da.add(str3);
        da.add(str4);
        da.add(str5);
        da.add(str6);
        da.add(str7);
        System.out.println(da.get(3));
        System.out.println(da.toString());
        da.remove(4);
        System.out.println(da.toString());
    }

    public static class DynamicArray<T> {
        private int index = 0;
        private T[] array;


        public DynamicArray() {
            int size = 10;
            array = (T[]) new Object[size];
        }

        public void add(T el) {
            double defaultLoadSize = 0.75;
            if (index >= array.length * defaultLoadSize) {
                double defaultNewSizeArray = 1.5;
                array = Arrays.copyOf(array, (int) (array.length * defaultNewSizeArray));
            }
            array[index++] = el;
        }

        public void remove(int index) {
            if (index < 0 || index > array.length) {
                throw new IndexOutOfBoundsException();
            }
            Object[] temp = (T[]) new Object[array.length];
            System.arraycopy(array, 0, temp, 0, index);
            System.arraycopy(array, index + 1, temp, index, array.length - index - 1);
            array = (T[]) temp;

        }

        public T get(int index) {
            return array[index];
        }

        @Override
        public String toString() {
            return "DynamicArray {" +
                    "array length = " + array.length +
                    ", array = " + Arrays.toString(array) +
                    '}';
        }
    }
}
