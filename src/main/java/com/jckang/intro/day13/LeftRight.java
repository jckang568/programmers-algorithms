package com.jckang.intro.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftRight {
    public static void main(String[] args) {
        /*
        문제 설명
        문자열 리스트 strList 에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
        strList 에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는
        문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에
        있는 문자열들을 순서대로 담은 리스트를 return 하도록 solution 함수를 완성해주세요.
        "l"이나 "r"이 없다면 빈 리스트를 return 합니다.

        제한사항
        1 ≤ strList 의 길이 ≤ 20
        str:ist 는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
        입출력 예
        str_list	            result
        ["u", "u", "l", "r"]	["u", "u"]
        ["l"]	                []
         */
        /*String[] strList = {"u", "u", "l", "r", "l"};
        String[] result = solution(strList);
        System.out.println(Arrays.toString(result));*/
        String[] strList2 = {"r", "r", "r"};
        String[] result2 = solution(strList2);
        System.out.println(Arrays.toString(result2));
    }

    private static String[] solution(String[] strList) {
        /* Stream 의 toList 메서드는 since JDK16 */
        List<String> list = Arrays.stream(strList)
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();
        int indexL = list.indexOf("l");
        indexL = indexL == -1 ? Integer.MAX_VALUE : indexL;
        int indexR = list.indexOf("r");
        indexR = indexR == -1 ? Integer.MAX_VALUE : indexR;

        if(indexL == Integer.MAX_VALUE && indexR == Integer.MAX_VALUE) {
            return new String[0];
        }

        if(indexL < indexR) {
            for(int i = 0; i < indexL; i++) {
                result.add(list.get(i));
            }
            return result.toArray(String[]::new);
        }

        if(indexR < indexL) {
            for(int i = indexR + 1; i < list.size(); i++) {
                result.add(list.get(i));
            }
            return result.toArray(String[]::new);
        }
        return result.toArray(String[]::new);
    }
}
