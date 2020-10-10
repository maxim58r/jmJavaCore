package ru.max.lsn7_2_13;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    public Map<String, List<T>> getMailBox() {
        Map<String, List<T>> map = new LinkedHashMap<>();
//        map.put();
        return map;
    }


    @Override
    public void accept(Sendable<T> sendable) {
        sendable.getFrom();
    }
}
