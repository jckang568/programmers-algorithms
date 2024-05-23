package com.jckang.intro.day11;

import java.util.Arrays;

public class CharacterRemover {
    public static void main(String[] args) {
        String myString = "apporoograpemmemprs";
        int[] indices = new int[]{1, 16, 6, 15, 0, 10, 11, 3};
        String expect = "programmers";
        String result = solution(myString, indices);
        System.out.println(expect.equals(result));
    }

    private static String solution(String myString, int[] indices) {
        StringBuilder sb = new StringBuilder(myString);
        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }
        return String.valueOf(sb);
    }
}
