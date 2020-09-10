package ru.max.lsn4_1_8;

/**
 * @author Serov Maxim
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();

        System.out.println(getCallerClassAndMethodName());
        m1();
    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());

    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        String str = new Exception().getStackTrace()[1].toString();
        if (str.contains("main")){
            return null;
        } else {
            String className = new Exception().getStackTrace()[2].getClassName();
            String methodName = new Exception().getStackTrace()[2].getMethodName();
            return className + "#" + methodName;
        }
    }
}
