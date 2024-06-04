package com.jckang.intro.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeOfTwo {
    public static void main(String[] args) {
        /*
        정수 배열 arr 가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은
        연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.

        단, arr 에 2가 없는 경우 [-1]을 return 합니다.

        제한사항
        1 ≤ arr 의 길이 ≤ 100,000
        1 ≤ arr 의 원소 ≤ 10

        입출력 예
        arr	                            result
        [1, 2, 1, 4, 5, 2, 9]	        [2, 1, 4, 5, 2]
        [1, 2, 1]	                    [2]
        [1, 1, 1]	                    [-1]
        [1, 2, 1, 2, 1, 10, 2, 1]	    [2, 1, 2, 1, 10, 2]
        [2, 2, 2]                       [2, 2, 2]
         */

        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        int[] expect = {2, 1, 4, 5, 2};
        int[] result = solution(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(expect, result));
    }

    private static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        if (list.size() == 1) {
            return new int[]{arr[list.get(0)]};
        }
        if (list.size() >= 2) {
            int start = list.get(0);
            int end = list.get(list.size() - 1);
            int[] result = new int[end - start + 1];
            System.arraycopy(arr, start, result, 0, end - start + 1);
            return result;
        }
        return new int[]{-1};
    }

}
