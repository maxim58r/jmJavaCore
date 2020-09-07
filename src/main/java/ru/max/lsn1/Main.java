package ru.max.lsn1;

public class Main {
    public static void main(String args[]) {
//        Overload test = new Overload();
//        test.method(null);

        Float f1 = Float.NaN;
        Float f2 = Float.NaN;
        System.out.println( ""+ (f1 == f2)+" "+f1.equals(f2)+ " "+(Float.NaN == Float.NaN) );
    }
    public class Overload{
        public void method(Object o) {
            System.out.println("Object");
        }
        public void method(java.io.FileNotFoundException f) {
            System.out.println("FileNotFoundException");
        }
        public void method(java.io.IOException i) {
            System.out.println("IOException");
        }

    }
}
