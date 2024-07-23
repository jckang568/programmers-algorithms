package com.jckang.intro.day13;


import java.util.Arrays;

public class OffsetIterator {
    public static void main(String[] args) {
        /*
        정수 리스트 num_list 와 정수 n이 주어질 때, n 번째 원소부터
        마지막 원소까지의 모든 원소를 담은 리스트를 return 하도록 solution 함수를 완성해주세요.

        제한사항
        2 ≤ num_list 의 길이 ≤ 30
        1 ≤ num_list 의 원소 ≤ 9
        1 ≤ n ≤ num_list 의 길이

        입출력 예
        num_list	        n	result
        [2, 1, 6]	        3	[6]
        [5, 2, 1, 7, 5]	    2	[2, 1, 7, 5]

         */
        int[] numList = {2, 1, 6};
        int n = 3;
        int[] expect = {6};
        int[] result = solution(numList, n);
        System.out.println(Arrays.equals(expect, result));

        int[] numList2 = {5, 2, 1, 7, 5};
        int n2 = 2;
        int[] expect2 = {2, 1, 7, 5};
        int[] result2 = solution(numList2, n2);
        System.out.println(Arrays.equals(expect2, result2));

    }

    private static int[] solution(int[] numList, int n) {
        int[] result = new int[numList.length - n + 1];
        System.arraycopy(numList, n - 1, result, 0, numList.length - n + 1);
        return result;
    }
}
