package com.jckang.intro.day17;

/**
 * 문제 설명<p>
 * 문자열 myString 과 pat 이 주어집니다.<p>
 * myString 에서 pat 이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.<p>
 * 제한사항<p>
 * 1 ≤ myString ≤ 1000<p>
 * 1 ≤ pat ≤ 10<p>
 * 입출력 예<p>
 * myString	pat	    result<p>
 * "banana"	"ana"	2<p>
 * "aaaa"	"aa"	3<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * "banana"에서 1 ~ 3번 인덱스에서 한 번, 3 ~ 5번 인덱스에서 또 한 번<p>
 * "ana"가 등장해서 총 두 번 등장합니다. 따라서 2를 return 합니다.<p>
 * 입출력 예 #2<p>
 * "aaaa"에서 0 ~ 2번 인덱스에서 한 번, 1 ~ 3번 인덱스에서 한 번,<p>
 * 2 ~ 4번 인덱스에서 한 번 "aa"가 등장해서 총 세 번 등장합니다. 따라서 3을 return 합니다.
 */
public class StringCounter {
    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";
        int expected = 2;
        int result = solution(myString, pat);
        System.out.println(expected == result);
    }

    private static int solution(String myString, String pat) {
        int result = 0;
        for(int i = 0; i < myString.length() - pat.length() + 1; i++) {
            String temp = myString.substring(i, pat.length() + i);
            if(temp.equals(pat)) {
                result++;
            }
        }
        return result;
    }
}
