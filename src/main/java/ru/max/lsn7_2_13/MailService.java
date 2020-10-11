package ru.max.lsn7_2_13;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> map = new LinkedHashMap<>();
    List<T> lst = new ArrayList<>();

    public Map<String, List<T>> getMailBox() {

        return map;
    }


    @Override
    public void accept(Sendable<T> sendable) {
        sendable.getFrom();
        sendable.getTo();
        sendable.getContent();
        lst.
        map.put(sendable.getTo(), sendable.getContent());

    }
}
