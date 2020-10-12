package ru.max.lsn7_2_13;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> map = new LinkedHashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.get(key);
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
            lst.add(t.getContent());
            map.put(t.getTo(), lst);
//            System.out.println(map + "2");
        } else /*if (!(map.containsKey(t.getTo()))) */{
            List<T> lst1 = new ArrayList<>();
            lst1.add(t.getContent());
            map.put(t.getTo(), lst1);
//            System.out.println(map + "1");
        }
        /*else map.putIfAbsent(t.getTo(), new ArrayList<>());*/
    }
}
