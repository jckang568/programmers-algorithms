package com.jckang.intro.day12;

import java.util.*;

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
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(expect, result));

        int[] arr2 = {4, 4, 4, 4, 4};
        int[] query2 = {4, 4};
        int[] expect2 = {4};
        int[] result2 = solution(arr2, query2);
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.equals(expect2, result2));

    }

    private static int[] solution(int[] arr, int[] query) {
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .toList();
        Deque<Integer> deque = new LinkedList<>(list);
        for (int i = 0; i < query.length; i++) {
            int index = deque.size();
            if (i % 2 == 0) {
                for (int j = 1; j < index - query[i]; j++) {
                    deque.pollLast();
                }
            } else {
                for (int j = 0; j < query[i]; j++) {
                    deque.pollFirst();
                }
            }
        }
        return deque.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
