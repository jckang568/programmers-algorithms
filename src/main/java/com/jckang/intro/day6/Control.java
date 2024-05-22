package com.jckang.intro.day6;

public class Control {
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }

    private static int solution(int n, String control) {
        char[] chars = control.toCharArray();
        for (char c : chars) {
            switch (c) {
                case 'w' -> n += 1;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }
}
