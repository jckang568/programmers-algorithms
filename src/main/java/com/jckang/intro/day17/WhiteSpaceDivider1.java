package com.jckang.intro.day17;

import java.util.Arrays;

/**
 * 문제 설명<p>
 * 단어가 공백 한 개로 구분되어 있는 문자열 my_string 이 매개변수로 주어질 때,<p>
 * my_string 에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을<p>
 * return 하는 solution 함수를 작성해 주세요.<p>
 * 제한사항<p>
 * my_string 은 영소문자와 공백으로만 이루어져 있습니다.<p>
 * 1 ≤ my_string 의 길이 ≤ 1,000<p>
 * my_string 의 맨 앞과 맨 뒤에 글자는 공백이 아닙니다.<p>
 * 입출력 예<p>
 * my_string	    result<p>
 * "i love you"	    ["i", "love", "you"]<p>
 * "programmers"	["programmers"]<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * 예제 1번의 my_string 은 "i love you"로 공백 한 칸으로 나누어진 단어들은 앞에서부터<p>
 * 순서대로 "i", "love", "you" 이므로 ["i", "love", "you"]를 return 합니다.<p>
 * 입출력 예 #2<p>
 * 예제 2번의 my_string 은 "programmers"로 단어가 하나만 있습니다.<p>
 * 따라서 ["programmers"]를 return 합니다.
 */
public class WhiteSpaceDivider1 {
    public static void main(String[] args) {
        String myString = "i love you";
        String[] expected = {"i", "love", "you"};
        String[] result = solution(myString);
        System.out.println(Arrays.equals(expected, result));
    }

    private static String[] solution(String myString) {
        return myString.split(" ");
    }
}
