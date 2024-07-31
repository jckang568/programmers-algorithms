package com.jckang.intro.day18;

import java.util.Arrays;

/**
 * 문제 설명<p>
 * 문자열 myString 이 주어집니다. myString 을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열<p>
 * 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.<p>
 * 제한사항<p>
 * 1 ≤ myString 의 길이 ≤ 100,000<p>
 * myString 은 알파벳 소문자로 이루어진 문자열입니다.<p>
 * 입출력 예<p>
 * myString	        result<p>
 * "oxooxoxxox"	    [1, 2, 1, 0, 1, 0]<p>
 * "xabcxdefxghi"	[0, 3, 3, 3]<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * "x"를 기준으로 문자열을 나누면 ["o", "oo", "o", "", "o", ""]가 됩니다.<p>
 * 각각의 길이로 배열을 만들면 [1, 2, 1, 0, 1, 0]입니다.<p>
 * 따라서 [1, 2, 1, 0, 1, 0]을 return 합니다.<p>
 * 입출력 예 #2<p>
 * "x"를 기준으로 문자열을 나누면 ["", "abc", "def", "ghi"]가 됩니다.<p>
 * 각각의 길이로 배열을 만들면 [0, 3, 3, 3]입니다. 따라서 [0, 3, 3, 3]을 return 합니다.
 */
public class BetweenXCounter {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        int[] expected = {1, 2, 1, 0, 1, 0};
        int[] result = solution(myString);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(expected, result));
    }

    private static int[] solution(String myString) {
        String[] splitedMyString = myString.split("x", -1);
        return Arrays.stream(splitedMyString)
                .mapToInt(String::length)
                .toArray();
    }
}
