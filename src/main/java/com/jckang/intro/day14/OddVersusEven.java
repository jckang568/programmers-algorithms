package com.jckang.intro.day14;

/**
 * 문제 설명
 * 정수 리스트 num_list 가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중
 * 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return 합니다.
 * <p>
 * 제한사항
 * 5 ≤ num_list 의 길이 ≤ 50
 * -9 ≤ num_list 의 원소 ≤ 9
 * 입출력 예
 * num_list	            result
 * [4, 2, 6, 1, 7, 6]	17
 * [-1, 2, 5, 6, 3]	    8
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * 홀수 번째 원소들의 합은 4 + 6 + 7 = 17, 짝수 번째 원소들의 합은 2 + 1 + 6 = 9 이므로 17을 return 합니다.
 * 입출력 예 #2
 * <p>
 * 홀수 번째 원소들의 합은 -1 + 5 + 3 = 7, 짝수 번째 원소들의 합은 2 + 6 = 8 이므로 8을 return 합니다.
 */
public class OddVersusEven {
    public static void main(String[] args) {
        int[] numList = {4, 2, 6, 1, 7, 6};
        int expect = 17;
        int result = solution(numList);
        System.out.println(result);
        System.out.println(expect == result);
    }

    private static int solution(int[] numList) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numList.length; i++) {
            if (i % 2 == 0) {
                oddSum += numList[i];
            } else {
                evenSum += numList[i];
            }
        }
        return Math.max(oddSum, evenSum);
    }
}