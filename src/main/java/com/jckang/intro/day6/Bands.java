package com.jckang.intro.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bands {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        int [] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2]) {
                    list.add(arr[j]);
                }
            }
            if(list.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = Collections.min(list);
            }
        }
        return result;
    }
}
