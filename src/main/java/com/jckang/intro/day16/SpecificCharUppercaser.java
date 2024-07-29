package com.jckang.intro.day16;

/**
 * 문제 설명 <p>
 * 영소문자로 이루어진 문자열 my_string 과 영소문자 1글자로 이루어진 문자열 alp 가<p>
 * 매개변수로 주어질 때, my_string 에서 alp 에 해당하는 모든 글자를 대문자로 바꾼<p>
 * 문자열을 return 하는 solution 함수를 작성해 주세요.<p>
 * 제한사항<p>
 * 1 ≤ my_string 의 길이 ≤ 1,000<p>
 * 입출력 예<p>
 * my_string	    alp	    result<p>
 * "programmers"	"p"	    "Programmers"<p>
 * "lowercase"	    "x"	    "lowercase"<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * 예제 1번의 my_string 은 "programmers"이고 alp 가 "p"이므로 my_string 에<p>
 * 모든 p를 대문자인 P로 바꾼 문자열 "Programmers"를 return 합니다.<p>
 * 입출력 예 #2<p>
 * 예제 2번의 alp 는 "x"이고 my_string 에 x는 없습니다. 따라서 "lowercase"를 return 합니다.
 */

public class SpecificCharUppercaser {
    public static void main(String[] args) {
        String myString = "programmers";
        String alp = "p";
        String expected = "Programmers";
        String result = solution(myString, alp);
        System.out.println(expected.equals(result));
    }

    private static String solution(String myString, String alp) {
        return myString.replaceAll(alp, alp.toUpperCase());
    }
}
