package com.jckang.intro.day18;

/**
 * 문제 설명<p>
 * 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다.<p>
 * 문자열 rny_string 이 주어질 때, rny_string 의 모든 'm'을 "rn"으로 바꾼<p>
 * 문자열을 return 하는 solution 함수를 작성해 주세요.<p>
 * 제한사항<p>
 * 1 ≤ rny_string 의 길이 ≤ 100<p>
 * rny_string 은 영소문자로만 이루어져 있습니다.<p>
 * 입출력 예<p>
 * rny_string	    result<p>
 * "masterpiece"	"rnasterpiece"<p>
 * "programmers"	"prograrnrners"<p>
 * "jerry"	        "jerry"<p>
 * "burn"	        "burn"<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * 예제 1번의 rny_string 의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.<p>
 * rny_string	m	a	s	t	e	r	p	i	e	c	e<p>
 * result	    rn	a	s	t	e	r	p	i	e	c	e<p>
 * 따라서 "rnasterpiece"를 return 합니다.<p>
 * 입출력 예 #2<p>
 * 예제 2번의 rny_string 의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.<p>
 * rny_string	p	r	o	g	r	a	m	m	e	r	s<p>
 * result	    p	r	o	g	r	a	rn	rn	e	r	s<p>
 * 따라서 "prograrnrners"를 return 합니다.<p>
 * 입출력 예 #3<p>
 * 예제 3번의 rny_string 에는 'm'이 없습니다.<p>
 * 따라서 rny_string 그대로인 "jerry"를 return 합니다.<p>
 * 입출력 예 #4<p>
 * 예제 4번의 rny_string 에는 'm'이 없습니다.<p>
 * 따라서 rny_string 그대로인 "burn"를 return 합니다.
 */
public class ReplaceString {
    public static void main(String[] args) {
        String rnyString = "masterpiece";
        String expected = "rnasterpiece";
        String result = solution(rnyString);
        System.out.println(expected.equals(result));
    }

    private static String solution(String rnyString) {
        return rnyString.replace("m", "rn");
    }

}
