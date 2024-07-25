package com.jckang.intro.day15;

/**
 * 문제 설명
 * 알파벳으로 이루어진 문자열 myString 과 pat 이 주어집니다.
 * myString 의 연속된 부분 문자열 중 pat 이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
 * <p>
 * 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
 * <p>
 * 제한사항
 * 1 ≤ myString 의 길이 ≤ 100,000
 * 1 ≤ pat 의 길이 ≤ 300
 * myString 과 pat 은 모두 알파벳으로 이루어진 문자열입니다.
 * 입출력 예
 * myString	    pat	        return
 * "AbCdEfG"	"aBc"	    1
 * "aaAA"	    "aaaaa"	    0
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * "AbCdEfG"의 0~2번 인덱스의 문자열은 "AbC"이며, 이는 pat 인 "aBc"와 같습니다. 따라서 1을 return 합니다.
 * 입출력 예 #2
 * <p>
 * myString 의 길이가 pat 보다 더 짧기 때문에 myString 의 부분 문자열 중 pat 와 같은 문자열이 있을 수 없습니다. 따라서 0을 return 합니다.
 */

public class StringFinder {
    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";
        int expected = 1;
        int result = solution(myString, pat);
        System.out.println(expected == result);
    }

    private static int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
