package ru.max.lsn7_2_13;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> map = new LinkedHashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.get(key);
        }
    };
    List<T> lst = new ArrayList<>();

    public Map<String, List<T>> getMailBox() {
        return map;
    }

    @Override
    public void accept(Sendable<T> t) {
        lst.add(t.getContent());
        map.merge(t.getTo(), lst, (ts, ts2) -> new ArrayList<>(ts2));
    }
}
