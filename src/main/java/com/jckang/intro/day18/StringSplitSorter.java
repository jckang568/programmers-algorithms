package com.jckang.intro.day18;

import java.util.Arrays;

/**
 * 문제 설명<p>
 * 문자열 myString 이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후<p>
 * 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.<p>
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.<p>
 * 제한사항<p>
 * 1 ≤ myString ≤ 100,000<p>
 * myString 은 알파벳 소문자로 이루어진 문자열입니다.<p>
 * 입출력 예<p>
 * myString	        result<p>
 * "axbxcxdx"	    ["a","b","c","d"]<p>
 * "dxccxbbbxaaaa"	["aaaa","bbb","cc","d"]<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * myString 을 "x"를 기준으로 자른 배열은 ["a","b","c","d"]이며,<p>
 * 이 배열은 이미 사전순으로 정렬된 상태입니다. 따라서 해당 배열을 return 합니다.<p>
 * 입출력 예 #2<p>
 * myString 을 "x"를 기준으로 자른 배열은 ["d","cc","bbb","aaaa"]이며,<p>
 * 이 배열을 사전순으로 정렬하면 ["aaaa","bbb","cc","d"]입니다. 따라서 해당 배열을 return 합니다.
 */
public class StringSplitSorter {
    public static void main(String[] args) {
        String myString = "axbxcxdx";
        String[] expected = {"a", "b", "c", "d"};
        String[] result = solution(myString);
        System.out.println(Arrays.equals(expected, result));
    }

    private static String[] solution(String myString) {
        String[] split = myString.split("x");
        return Arrays.stream(split)
                .filter(str -> !str.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }
}
