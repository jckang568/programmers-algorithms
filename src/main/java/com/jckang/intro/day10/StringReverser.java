package com.jckang.intro.day10;

public class StringReverser {
    public static void main(String[] args) {
        String myString1 = "Progra21Sremm3", myString2 = "Stanley1yelnatS";
        int s1 = 6, s2 = 4;
        int e1 = 12, e2 = 10;
        System.out.println(solution(myString1,s1, e1));
    }

    private static String solution(String myString, int s, int e) {
        char[] arr = myString.toCharArray();
        int i = s, j = e;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

}
