package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main() {
        List<Integer> intList = new ArrayList(Arrays.asList(2, 1, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0).filter(x -> x % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}

