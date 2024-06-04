package com.jckang.intro.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySlicer {
    public static void main(String[] args) {
        /*
        입출력 예
        arr	                query	    result
        [0, 1, 2, 3, 4, 5]	[4, 1, 2]	[1, 2, 3]
         */
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        int[] expect = {1, 2, 3};
        int[] result = solution(arr, query);
        System.out.println(Arrays.equals(expect, result));

    }

    private static int[] solution(int[] arr, int[] query) {
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < list.size() - query[i]; j++) {
                    list.remove(list.size() - 1);
                }
            } else {
                for(int j = 0; j < query[i]; j++) {
                    list.remove(0);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
        /*for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return null;*/
    }
}
