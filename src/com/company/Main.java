package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList(Arrays.asList(2, 1, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        for (int i = 0; i < intList.size(); ) {
            if (intList.get(i) > 0 && intList.get(i) % 2 == 0) {
                i++;
            } else {
                intList.remove(i);
            }
        }
//        Collections.sort(intList);
        intList.sort((a, b) -> {
            if (a > b) {
                return 1;
            } else {
                if (b > a) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(intList);
        StreamMain.main();
    }
}


