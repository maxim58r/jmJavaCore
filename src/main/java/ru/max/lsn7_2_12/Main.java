package ru.max.lsn7_2_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> lst = new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .flatMap(words -> Arrays.stream(words.split("[ ,.\\-!]+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Collections.reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .map(stringLongEntry -> stringLongEntry.getKey())
                .collect(Collectors.<String>toList());
        for (String s : lst) {
            System.out.println(s);
        }
    }
// Lorem! ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.
}

