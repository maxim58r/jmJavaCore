package ru.max.lsn7_2_11;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order)
                .collect(Collectors.toList());
        T min;
        T max;
        if (!(list.isEmpty())) {
            min = list.stream()
                    .findFirst().get();
            max = list.stream()
                    .reduce((f, s) -> s).get();
            minMaxConsumer.accept(min, max);
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}
