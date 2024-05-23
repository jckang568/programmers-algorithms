package com.jckang.intro.day11;

public class ClosestOneFinder {
    public static void main(String[] args) {
        /*
        정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다.
        정수 idx가 주어졌을 때, idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를
        찾아서 반환하는 solution 함수를 완성해 주세요.

        단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.

        arr                 idx	    result
        [0, 0, 0, 1]	    1	    3
        [1, 0, 0, 1, 0, 0]	4	    -1
        [1, 1, 1, 1, 0]	    3	    3
         */
        int[] arr = new int[]{0, 0, 0, 1};
        int idx = 1;
        int expect = 3;
        int result = solution(arr, idx);
        System.out.println(expect == result);
    }

    private static int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

}
