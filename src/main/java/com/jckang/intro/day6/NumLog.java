package com.jckang.intro.day6;

public class NumLog {
    public static void main(String[] args) {
        int[] test = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(test));
    }

    private static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numLog.length - 1; i++) {
            int move = numLog[i + 1] - numLog[i];
            switch (move) {
                case 1 -> sb.append("w");
                case -1 -> sb.append("s");
                case 10 -> sb.append("d");
                case -10 -> sb.append("a");
            }
        }
        return sb.toString();
    }
}
