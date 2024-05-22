package com.jckang.intro.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBuilder5 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789", "9876543210", "9999999999999" };
        int k = 50000, s = 5, l = 5;
        System.out.println(Arrays.toString(solution(intStrs, k, s, l)));
    }

    private static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String intStr : intStrs) {
            int extractedInt = Integer.parseInt(intStr.substring(s, s + l));
            if (extractedInt > k) {
                list.add(extractedInt);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
