package com.jckang.intro.day17;

/**
 * 문제 설명<p>
 * 문자열 myString 과 pat 가 주어집니다.<p>
 * myString 의 부분 문자열중 pat 로 끝나는 가장 긴 부분 문자열을 찾아서<p>
 * return 하는 solution 함수를 완성해 주세요.<p>
 * 제한사항<p>
 * 5 ≤ myString ≤ 20<p>
 * 1 ≤ pat ≤ 5<p>
 * pat 은 반드시 myString 의 부분 문자열로 주어집니다.<p>
 * myStrin g과 pat 에 등장하는 알파벳은 대문자와 소문자를 구분합니다.<p>
 * 입출력 예<p>
 * myString	    pat	    result<p>
 * "AbCdEFG"	"dE"	"AbCdE"<p>
 * "AAAAaaaa"	"a"	    "AAAAaaaa"<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * "AbCdEFG"에서 "dE"는 한 번 등장하며 처음부터 해당 위치까지 잘라내면 "AbCdE"가 됩니다.<p>
 * 따라서 이 문자열이 "dE"로 끝나는 가장 긴 문자열이며, "AbCdE"를 return 합니다.<p>
 * 입출력 예 #2<p>
 * "AAAAaaaa"에서 "a"는 총 네 번 등장하며 이 중 가장 마지막에 있는 위치까지 잘라내면 "AAAAaaaa"가 됩니다.<p>
 * 따라서 이 문자열이 "a"로 끝나는 가장 긴 문자열이며, "AAAAaaaa"를 return 합니다.
 */
public class LongestSubstring {
    public static void main(String[] args) {
        String myString = "AbCdEFG";
        String pat = "dE";
        String expected = "AbCdE";
        String result = solution(myString, pat);
        System.out.println(expected.equals(result));

    }

    private static String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat);
        return myString.substring(0, index) + pat;
    }
}
