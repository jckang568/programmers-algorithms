package com.jckang.intro.day9;

public class SuffixValidator {
    public static void main(String[] args) {
        String myString = "banana", isSuffix = "ana";
        System.out.println(solution(myString, isSuffix));
    }

    private static int solution(String myString, String isSuffix) {
        return myString.endsWith(isSuffix) ? 1 : 0;
    }
}
