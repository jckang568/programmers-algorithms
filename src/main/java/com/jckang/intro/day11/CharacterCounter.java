package com.jckang.intro.day11;

import java.util.Arrays;

public class CharacterCounter {
    public static void main(String[] args) {
        String myString = "Programmers";
        int[] expect = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0};
        int[] result = solution(myString);
        System.out.println(Arrays.equals(expect, result));
    }

    private static int[] solution(String myString) {
        char[] chars = myString.toCharArray();
        int[] result = new int['Z' - 'A' + 1 + 'z' - 'a' + 1];
        for (char ch : chars) {
            if (ch > 'Z') {
                result[ch - ('A' + ('a' - ('Z' + 1)))]++;
            } else {
                result[ch - 'A']++;
            }
        }
        return result;
    }
}
