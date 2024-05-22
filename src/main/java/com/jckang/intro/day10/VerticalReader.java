package com.jckang.intro.day10;

public class VerticalReader {
    public static void main(String[] args) {
        String myString = "ihrhbakrfpndopljhygc";
        int m = 4, c = 2;
        System.out.println(solution(myString, m, c));
    }
    public static String solution(String myString, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < myString.length() ; i += m) {
            sb.append(myString.charAt(i + c - 1));
        }
        return sb.toString();
    }
}
