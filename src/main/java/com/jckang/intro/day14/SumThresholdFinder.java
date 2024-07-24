package com.jckang.intro.day14;

/**
 * 문제 설명
 * 정수 배열 numbers 와 정수 n이 매개변수로 주어집니다. numbers 의 원소를 앞에서부터 하나씩 더하다가 그 합이
 * n보다 커지는 순간 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
 * <p>
 * 제한사항
 * 1 ≤ numbers 의 길이 ≤ 100
 * 1 ≤ numbers 의 원소 ≤ 100
 * 0 ≤ n < numbers 의 모든 원소의 합
 * <p>
 * 입출력 예
 * numbers	                    n	    result
 * [34, 5, 71, 29, 100, 34]	    123	    139
 * [58, 44, 27, 10, 100]	    139	    239
 * <p>
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * 예제 1번의 numbers 를 문제 설명대로 더해가는 과정을 나타내면 다음의 표와 같습니다.
 * <p>
 * i	numbers[i]	sum
 * 0
 * 0	34	        34
 * 1	5	        39
 * 2	71	        110
 * 3	29	        139
 * 29를 더한 뒤에 sum 값은 139이고 n 값인 123보다 크므로 139를 return 합니다.
 * <p>
 * 예제 2번의 numbers 의 마지막 원소 전까지의 원소를 sum 에 더하면 139입니다.
 * 139는 n 값인 139보다 크지 않고 마지막 원소인 100을 더하면 139보다 커지므로 239를 return 합니다.
 */

public class SumThresholdFinder {
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        int expect = 139;
        int result = solution(numbers, n);
        System.out.println(expect == result);

    }

    private static int solution(int[] numbers, int n) {
        int sum = 0;
        for (int number : numbers) {
            if (sum > n) {
                return sum;
            }
            sum += number;
        }
        return sum;
    }
}
