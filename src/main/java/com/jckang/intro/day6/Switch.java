package com.jckang.intro.day6;

import java.util.Arrays;

public class Switch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0,3}, {1,2}, {1,4}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int change = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = change;
        }
        return arr;
    }
}
