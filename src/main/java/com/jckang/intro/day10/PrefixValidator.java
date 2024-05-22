package com.jckang.intro.day10;

public class PrefixValidator {
    public static void main(String[] args) {
        String myString = "banana", isPrefix="ban";
        System.out.println(solution(myString, isPrefix));
    }

    private static int solution(String myString, String isPrefix) {
        return myString.startsWith(isPrefix) ? 1 : 0;
    }
}
