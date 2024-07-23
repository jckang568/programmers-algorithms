package com.jckang.intro.day13;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayReorganizer {
    public static void main(String[] args) {
        /*
        문제 설명
        정수 리스트 num_list 와 정수 n이 주어질 때, num_list 를 n 번째 원소 이후의 원소들과 n 번째까지의
        원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return 하도록 solution 함수를 완성해주세요.

        제한사항
        2 ≤ num_list 의 길이 ≤ 30
        1 ≤ num_list 의 원소 ≤ 9
        1 ≤ n ≤ num_list 의 길이
        입출력 예
        num_list	        n	    result
        [2, 1, 6]	        1	    [1, 6, 2]
        [5, 2, 1, 7, 5]	    3	    [7, 5, 5, 2, 1]
        [5, 2, 1, 7, 5]	    1	    [2, 1, 7, 5, 5]
         */
        int[] numList = {2, 1, 6};
        int n = 1;
        int[] expect = {1, 6, 2};
        int[] result = solution(numList, n);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(expect, result));
        int[] numList2 = {5, 2, 1, 7, 5};
        int n2 = 3;
        int[] expect2 = {7, 5, 5, 2, 1};
        int[] result2 = solution(numList2, n2);
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.equals(expect2, result2));
        int[] numList3 = {5, 2, 1, 7, 5};
        int n3 = 1;
        int[] expect3 = {2, 1, 7, 5, 5};
        int[] result3 = solution(numList3, n3);
        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.equals(expect3, result3));
    }

    private static int[] solution(int[] numList, int n) {
        // int 배열을 Integer 배열로 변환
        Integer[] integerArray = Arrays.stream(numList).boxed().toArray(Integer[]::new);

        // Integer 배열을 Deque<Integer>로 변환
        Deque<Integer> deque = new LinkedList<>(Arrays.asList(integerArray));

        int count;
        if (n > numList.length / 2) {
            count = numList.length - n;
            for (int i = 0; i < count; i++) {
                deque.addFirst(deque.removeLast());
            }
        }
        if (n <= numList.length / 2) {
            count = n;
            for (int i = 0; i < count; i++) {
                deque.addLast(deque.removeFirst());
            }
        }
        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}