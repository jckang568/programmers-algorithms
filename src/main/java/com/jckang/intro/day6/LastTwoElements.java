package com.jckang.intro.day6;

import java.util.Arrays;

public class LastTwoElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6})));
    }

    private static int[] solution(int[] numList) {
        int lastElement = numList[numList.length - 1];
        int lastPreElement = numList[numList.length - 2];
        int[] result = Arrays.copyOf(numList, numList.length + 1);
        if (lastElement > lastPreElement) {
            result[result.length - 1] = lastElement - lastPreElement;
        } else {
            result[result.length - 1] = lastElement * 2;
        }
        return result;
    }

}
