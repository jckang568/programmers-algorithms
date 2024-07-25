package com.jckang.intro.day15;

import java.util.Arrays;

/**
 * 문제 설명
 * 정수가 담긴 리스트 num_list 가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는
 * 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return 하도록 solution 함수를 완성해주세요.
 * <p>
 * 제한사항
 * 2 ≤ num_list 의 길이 ≤ 20
 * 1 ≤ num_list 의 원소 ≤ 9
 * num_list 의 원소를 모두 곱했을 때 2,147,483,647를 넘는 입력은 주어지지 않습니다.
 * 입출력 예
 * num_list	                                result
 * [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]	51
 * [2, 3, 4, 5]	                            120
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * 리스트의 길이가 13이므로 모든 원소의 합인 51을 return 합니다.
 * 입출력 예 #2
 * <p>
 * 리스트의 길이가 4이므로 모든 원소의 곱인 120을 return 합니다.
 */

public class OperationByLength {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int expected = 51;
        int result = solution(numList);
        System.out.println(result == expected);
    }

    private static int solution(int[] numList) {
        if (numList.length > 10) {
            return Arrays.stream(numList).sum();
        }
        return Arrays.stream(numList).reduce(1, (x, y) -> x * y);
    }
}
