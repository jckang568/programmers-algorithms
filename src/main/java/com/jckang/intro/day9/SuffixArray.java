package com.jckang.intro.day9;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SuffixArray {
    public static void main(String[] args) {
        String myString = "banana";
        System.out.println(Arrays.toString(solution(myString)));
    }

    private static String[] solution(String myString) {
        StringBuilder sb = new StringBuilder(myString);
        Set<String> set = new TreeSet<>(List.of(myString));
        for (int i = 0; i < myString.length() - 1; i++) {
            set.add(String.valueOf(sb.deleteCharAt(0)));
        }
        return set.toArray(String[]::new);

    }
}
