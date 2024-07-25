package com.jckang.intro.day15;

/**
 * 문제 설명
 * 정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다.
 * 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
 * <p>
 * 10 / 2 = 5
 * (5 - 1) / 2 = 2
 * 2 / 2 = 1
 * 위와 같이 3번의 나누기 연산으로 1이 되었습니다.
 * <p>
 * 정수들이 담긴 리스트 num_list 가 주어질 때, num_list 의 모든 원소를 1로 만들기
 * 위해서 필요한 나누기 연산의 횟수를 return 하도록 solution 함수를 완성해주세요.
 * <p>
 * 제한사항
 * 3 ≤ num_list 의 길이 ≤ 15
 * 1 ≤ num_list 의 원소 ≤ 30
 * 입출력 예
 * num_list	            result
 * [12, 4, 15, 1, 14]	11
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * 12는 3번, 4는 2번, 15는 3번, 1은 0번, 14는 3번의 연산이 필요하기 때문에 총 11번의 연산이 필요합니다.
 */

public class MakeOne {
    public static void main(String[] args) {
        int[] numList = {12, 4, 15, 1, 14};
        int expected = 11;

        int result = solution(numList);
        System.out.println(getBinaryLength(expected));
        System.out.println(result);
    }

    private static int solution(int[] numList) {
        int result = 0;
        for (int i : numList) {
            result += getBinaryLength(i) - 1;
        }
        return result;
    }

    private static int getBinaryLength(int number) {
        int length = 0;
        while (number > 0) {
            number = number >> 1;
            length++;
        }
        return length;
    }
}
