package com.jckang.intro.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBuilder4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(solution(arr)));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(solution(arr2)));
        int[] arr3 = {4, 4};
        System.out.println(Arrays.toString(solution(arr3)));
        int[] arr4 = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(solution(arr4)));
    }

    private static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } else if (arr[i] <= list.get(list.size() - 1)) {
                list.remove(list.size() - 1);
            } else if (arr[i] > list.get(list.size() - 1)) {
                list.add(arr[i]);
                i++;
            }

        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
