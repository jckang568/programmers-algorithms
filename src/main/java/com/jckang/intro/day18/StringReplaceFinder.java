package com.jckang.intro.day18;

/**
 * 문제 설명<p>
 * 문자 "A"와 "B"로 이루어진 문자열 myString 과 pat 가 주어집니다.<p>
 * myString 의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중<p>
 * pat 이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.<p>
 * 제한사항<p>
 * 1 ≤ myString 의 길이 ≤ 100<p>
 * 1 ≤ pat 의 길이 ≤ 10<p>
 * myString 과 pat 는 문자 "A"와 "B"로만 이루어진 문자열입니다.<p>
 * 입출력 예<p>
 * myString	pat	    result<p>
 * "ABBAA"	"AABB"	1<p>
 * "ABAB"	"ABAB"	0<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * "ABBAA"에서 "A"와 "B"를 서로 바꾸면 "BAABB"입니다.<p>
 * 여기에는 부분문자열 "AABB"가 있기 때문에 1을 return 합니다.<p>
 * 입출력 예 #2<p>
 * "ABAB"에서 "A"와 "B"를 서로 바꾸면 "BABA"입니다.<p>
 * 여기에는 부분문자열 "BABA"가 없기 때문에 0을 return 합니다.
 */
public class StringReplaceFinder {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        int expected = 1;
        int result = solution(myString, pat);
        System.out.println(expected == result);
    }

    private static int solution(String myString, String pat) {
        char[] myChars = myString.toCharArray();
        for (int i = 0; i < myChars.length; i++) {
            if (myChars[i] == 'A') {
                myChars[i] = 'B';
                continue;
            }
            if (myChars[i] == 'B') {
                myChars[i] = 'A';
            }
        }
        return new String(myChars).contains(pat) ? 1 : 0;
    }
}
