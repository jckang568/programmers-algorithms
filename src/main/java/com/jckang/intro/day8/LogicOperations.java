package com.jckang.intro.day8;

public class LogicOperations {
    public static void main(String[] args) {
        boolean x1 = false, x2 = true, x3 = true, x4 = true;
        System.out.println(solution(x1, x2, x3, x4));
    }

    private static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}
