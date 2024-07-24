package com.jckang.intro.day14;

import java.util.Arrays;

/**
 * 문제 설명
 * 최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 name s가 주어질 때,
 * 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return 하도록 solution 함수를 완성해주세요.
 * 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
 * <p>
 * 제한사항
 * 5 ≤ names 의 길이 ≤ 30
 * 1 ≤ names 의 원소의 길이 ≤ 10
 * name s의 원소는 영어 알파벳 소문자로만 이루어져 있습니다.
 * 입출력 예
 * names	                                                    result
 * ["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]	["nami", "vex"]
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * 앞에서부터 5명씩 두 그룹으로 묶을 수 있습니다.
 * ["nami", "ahri", "jayce", "garen", "ivern"], ["vex", "jinx"]
 * 이 두 그룹에서 가장 앞에 서있는 사람들의 이름을 담은 리스트인 ["nami", "vex"]를 return합니다.
 */
public class FrontNameExtractor {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx", "eight", "nine", "ten"};
        String[] expect = {"nami", "vex"};
        String[] result = solution(names);
        System.out.println((int) Math.ceil((float) 5 / 2));
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(result, expect));
    }

    private static String[] solution(String[] names) {
        String[] result = new String[(int) Math.ceil((float) names.length / 5)];
        for (int i = 0; i < names.length; i += 5) {
            result[i / 5] = names[i];
        }
        return result;
    }
}
