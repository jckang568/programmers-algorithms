package com.jckang.intro.day16;

/**
 * 문제 설명
 * 알파벳으로 이루어진 문자열 myString 이 주어집니다.
 * <p>
 * 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
 * <p>
 * 제한사항
 * <p>
 * 1 ≤ myString 의 길이 ≤ 100,000
 * <p>
 * myString 은 알파벳으로 이루어진 문자열입니다.
 * <p>
 * 입출력 예
 * <p>
 * myString	    result
 * <p>
 * "aBcDeFg"    "ABCDEFG"
 * <p>
 * "AAA"	    "AAA"
 */
public class ToUpperCase {
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        String expected = "ABCDEFG";
        String result = solution(myString);
        System.out.println(expected.equals(result));
    }

    private static String solution(String myString) {
        return myString.toUpperCase();
    }
}
