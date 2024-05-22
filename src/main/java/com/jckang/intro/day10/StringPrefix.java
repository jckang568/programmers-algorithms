package com.jckang.intro.day10;

public class StringPrefix {
    public static void main(String[] args) {
        String myString1 = "ProgrammerS123", myString2 = "He110W0rld";
        int n1 = 11, n2 = 5;
        System.out.println(solution(myString1, n1));
        System.out.println(solution(myString2, n2));
        
    }

    private static String solution(String myString, int n) {
        return myString.substring(0, n);
    }
}
