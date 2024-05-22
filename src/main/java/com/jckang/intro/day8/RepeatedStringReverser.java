package com.jckang.intro.day8;

public class RepeatedStringReverser {
    public static void main(String[] args) {
        String myString = "rermgorpsam";
        int[][] queries = {{2, 3,}, {0, 7}, {5, 9,}, {6, 10}};
        System.out.println(solution(myString, queries));
    }

    private static String solution(String myString, int[][] queries) {
        char[] arr = myString.toCharArray();
        for (int[] query : queries) {
            reverseRange(arr, query[0], query[1]);
        }
        return new String(arr);
    }

    private static void reverseRange(char[] arr, int start, int end) {
        int i = start, j = end;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
