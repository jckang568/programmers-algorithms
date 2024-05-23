package com.jckang.intro.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBuilder1 {
    /*
    정수 n과 k가 주어졌을 때, 1 이상 n 이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을
    return 하는 solution 함수를 완성해 주세요.
     */
    public static void main(String[] args) {
        int n = 10, k = 3;
        int[] expect = new int[]{3, 6, 9};
        int[] result = solution(n, k);
        System.out.println(Arrays.equals(expect, result));
    }

    private static int[] solution(int n, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = k; i <= n; i += k) {
            result.add(i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
