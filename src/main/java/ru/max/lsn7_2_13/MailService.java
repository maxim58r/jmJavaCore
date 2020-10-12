package ru.max.lsn7_2_13;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> map = new LinkedHashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            if (containsKey(key)) {
                return super.get(key);
            } else {
                List<T> lst = new ArrayList<>();
                put((String) key, lst);
                return lst;
            }

        }
    };

    public Map<String, List<T>> getMailBox() {
        return map;
    }

    @Override
    public void accept(Sendable<T> t) {
        List<T> lst;
        if (map.containsKey(t.getTo())) {
            lst = map.get(t.getTo());
        } else {
            lst = new ArrayList<>();
        }
        lst.add(t.getContent());
        map.put(t.getTo(), lst);
    }
}
