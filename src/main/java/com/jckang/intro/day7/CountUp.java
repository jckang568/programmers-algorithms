package com.jckang.intro.day7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountUp {
    public static void main(String[] args) {
        int startNum = 3;
        int endNum = 10;
        System.out.println(Arrays.toString(solution(startNum, endNum)));
    }

    private static int [] solution(int startNum, int endNum) {
        return IntStream.rangeClosed(startNum, endNum).toArray();
    }
}
