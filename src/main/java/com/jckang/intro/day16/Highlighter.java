package com.jckang.intro.day16;

import java.util.Arrays;

/**
 * 문제 설명<p>
 * 문자열 myString 이 주어집니다. myString 에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고,<p>
 * "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.<p>
 * 제한사항<p>
 * 1 ≤ myString 의 길이 ≤ 20<p>
 * myString 은 알파벳으로 이루어진 문자열입니다.<p>
 * 입출력 예<p>
 * myString	            result<p>
 * "abstract algebra"	"AbstrAct AlgebrA"<p>
 * "PrOgRaMmErS"	    "progrAmmers"<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * 0번, 5번, 9번, 15번 인덱스의 "a"는 소문자이므로 전부 대문자로 고쳐줍니다.<p>
 * 다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.<p>
 * 따라서 "AbstrAct AlgebrA"를 return 합니다.<p>
 * 입출력 예 #2<p>
 * 0번, 2번, 4번, 6번, 8번, 10번 인덱스의 문자들은 "A"가 아닌 대문자이므로 전부 소문자로 고쳐줍니다.<p>
 * 5번 인덱스의 "a"는 소문자이므로 대문자로 고쳐줍니다.<p>
 * 다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.<p>
 * 따라서 "progrAmmers"를 return 합니다.
 */
public class Highlighter {
    public static void main(String[] args) {
        String myString = "abstract algebra";
        String expected = "AbstrAct AlgebrA";
        String result = solution(myString);
        System.out.println(expected);
        System.out.println(result);
        System.out.println(expected.equals(result));
    }

    private static String solution(String myString) {
        return myString.toLowerCase().replace('a', 'A');
    }
}
