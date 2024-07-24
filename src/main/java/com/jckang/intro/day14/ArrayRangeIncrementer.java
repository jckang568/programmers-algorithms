package com.jckang.intro.day14;


import java.util.Arrays;

/**
 * 문제 설명
 * 정수 배열 arr 와 2차원 정수 배열 queries 이 주어집니다.
 * queries 의 원소는 각각 하나의 query 를 나타내며, [s, e] 꼴입니다.
 * <p>
 * 각 query 마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
 * <p>
 * 위 규칙에 따라 queries 를 처리한 이후의 arr 를 return 하는 solution 함수를 완성해 주세요.
 * <p>
 * 제한사항
 * 1 ≤ arr 의 길이 ≤ 1,000
 * 0 ≤ arr 의 원소 ≤ 1,000,000
 * 1 ≤ queries 의 길이 ≤ 1,000
 * 0 ≤ s ≤ e < arr 의 길이
 * <p>
 * 입출력 예
 * arr	            queries	                result
 * [0, 1, 2, 3, 4]	[[0, 1],[1, 2],[2, 3]]	[1, 3, 4, 4, 4]
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * 각 쿼리에 따라 arr 가 다음과 같이 변합니다.
 * i	queries[i]	arr
 * -	-	        [0, 1, 2, 3, 4]
 * 0	[0,1]	    [1, 2, 2, 3, 4]
 * 1	[1,2]	    [1, 3, 3, 3, 4]
 * 2	[2,3]	    [1, 3, 4, 4, 4]
 * 따라서 [1, 3, 4, 4, 4]를 return 합니다.
 */
public class ArrayRangeIncrementer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] queries = {{0, 1}, {1, 2}, {2, 4}};
        int[] expect = {2, 4, 5, 5, 6, 6, 7, 8, 9, 10};
        int[] result = solution(arr, queries);
        System.out.println(Arrays.equals(expect, result));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}
