package com.jckang.intro.day11;

import java.util.Arrays;

public class Countdown {
    public static void main(String[] args) {
        /*
        정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을
        차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        start_num	end_num	    result
        10	        3	        [10, 9, 8, 7, 6, 5, 4, 3]
         */
        int startNum = 10, endNum = 3;
        int[] expect = new int[]{10, 9, 8, 7, 6, 5, 4, 3};
        int[] result = solution(startNum, endNum);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(expect, result));
    }

    private static int[] solution(int startNum, int endNum) {
        int[] result = new int[startNum - endNum + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = startNum - i;
        }
        return result;
    }
}
