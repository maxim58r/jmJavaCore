package ru.max.lsn4_3_6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {

    }

    public static void logging() {
        Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");
        LOGGER.log(Level.INFO, "Все хорошо");
        LOGGER.log(Level.WARNING,"Произошла ошибка");
    }
}
