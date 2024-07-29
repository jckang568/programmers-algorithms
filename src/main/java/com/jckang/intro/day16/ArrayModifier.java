package com.jckang.intro.day16;

import java.util.Arrays;

/**
 * 문제 설명<p>
 * 문자열 배열 strArr 가 주어집니다. 모든 원소가 알파벳으로만 이루어져 있을 때,<p>
 * 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 짝수번째 인덱스의<p>
 * 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.<p>
 * 제한사항<p>
 * 1 ≤ strArr ≤ 20<p>
 * 1 ≤ strArr 의 원소의 길이 ≤ 20<p>
 * strArr 의 원소는 알파벳으로 이루어진 문자열 입니다.<p>
 * 입출력 예<p>
 * strArr	                    result<p>
 * ["AAA","BBB","CCC","DDD"]	["aaa","BBB","ccc","DDD"]<p>
 * ["aBc","AbC"]	            ["abc","ABC"]<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * strArr[0]과 strArr[2]는 짝수번째 인덱스의 문자열이므로 모두 소문자로 바꿔서 "aaa"와 "ccc"가 됩니다.<p>
 * strArr[1]과 strArr[3]는 홀수번째 인덱스의 문자열인데 원래 대문자이므로 그대로 둡니다.<p>
 * 따라서 ["aaa","BBB","ccc","DDD"]를 return 합니다.<p>
 * 입출력 예 #2<p>
 * strArr[0]은 짝수번째 인덱스의 문자열이므로 소문자로 바꿔서 "abc"가 됩니다.<p>
 * strArr[1]은 홀수번째 인덱스의 문자열이므로 대문자로 바꿔서 "ABC"가 됩니다.<p>
 * 따라서 ["abc","ABC"]를 return 합니다.
 */
public class ArrayModifier {
    public static void main(String[] args) {
        String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
        String[] expected = {"aaa", "BBB", "ccc", "DDD"};
        String[] result = solution(strArr);
        System.out.println(Arrays.equals(expected, result));
    }

    private static String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}
