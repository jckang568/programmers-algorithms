package com.jckang.intro.day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 문제 설명<p>
 * 문자열 binomial 이 매개변수로 주어집니다.<p>
 * binomial 은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.<p>
 * 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.<p>
 * 제한사항<p>
 * 0 ≤ a, b ≤ 40,000<p>
 * 0을 제외하고 a, b는 0으로 시작하지 않습니다.<p>
 * 입출력 예<p>
 * binomial	        result<p>
 * "43 + 12"	    55<p>
 * "0 - 7777"	    -7777<p>
 * "40000 * 40000"	1600000000<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * 예제 1번의 binomial 은 "43 + 12"로 이 식을 계산한 결과인 43 + 12 = 55를 return 합니다.<p>
 * 입출력 예 #2<p>
 * 예제 2번의 binomial 은 "0 - 7777"로 이 식을 계산한 결과인 0 - 7777 = -7777을 return 합니다.<p>
 * 입출력 예 #3<p>
 * 예제 3번의 binomial 은 "40000 * 40000"으로 이 식을 계산한<p>
 * 결과인 40000 × 40000 = 1600000000을 return 합니다.
 */
public class SimpleExpressionEvaluator {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        int expected = 55;
        int result = solution(binomial);
        System.out.println(expected == result);
    }

    private static int solution(String binomial) {
        Pattern pattern = Pattern.compile("(\\d+)\\s*([+\\-*])\\s*(\\d+)");
        Matcher matcher = pattern.matcher(binomial);
        int result = 0;
        if (matcher.matches()) {
            int operand1 = Integer.parseInt(matcher.group(1));
            String operator = matcher.group(2);
            int operand2 = Integer.parseInt(matcher.group(3));
            result = switch (operator) {
                case "+" -> operand1 + operand2;
                case "-" -> operand1 - operand2;
                case "*" -> operand1 * operand2;
                default -> result;
            };
        }
        return result;
    }
}
