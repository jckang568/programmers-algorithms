package com.jckang.intro.day17;

import java.util.Arrays;

/**
 * 문제 설명<p>
 * 문자열 배열 strArr 가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든<p>
 * 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.<p>
 * 제한사항<p>
 * 1 ≤ strArr 의 길이 ≤ 1,000<p>
 * 1 ≤ strArr 의 원소의 길이 ≤ 20<p>
 * strArr 의 원소는 알파벳 소문자로 이루어진 문자열입니다.<p>
 * 입출력 예<p>
 * strArr	                        result<p>
 * ["and","notad","abcd"]	        ["and","abcd"]<p>
 * ["there","are","no","a","ds"]	["there","are","no","a","ds"]<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * 1번 인덱스의 문자열인 "notad"는 부분 문자열로 "ad"를 가집니다. 따라서 해당 문자열을 제거하고<p>
 * 나머지는 순서를 유지하여 ["and","abcd"]를 return 합니다.<p>
 * 입출력 예 #2<p>
 * "ad"가 부분 문자열로 들어간 문자열이 존재하지 않습니다. 따라서 원래 배열을 그대로 return 합니다.
 */
public class ADRemover {
    public static void main(String[] args) {
        String[] strArr = {"and", "notad", "abcd"};
        String[] expected = {"and", "abcd"};
        String[] result = solution(strArr);
        System.out.println(Arrays.equals(expected, result));
    }

    private static String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(s -> !s.contains("ad"))
                .toArray(String[]::new);
    }
}
