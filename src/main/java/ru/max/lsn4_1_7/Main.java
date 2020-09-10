package ru.max.lsn4_1_7;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) throws MyNewException {

    }

    class MyNewException extends Exception {
    }

    public void testExp() throws MyNewException {
        throw new MyNewException();
    }
}
