package com.jckang.intro.day7;

import java.util.*;

public class ArrayBuilder2 {
    public static void main(String[] args) {
        /*
        정수 l과 r이 주어졌을 때, l 이상 r 이하의 정수 중에서 숫자 "0"과 "5"로만
        이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
        만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
         */
        int l = 5;
        int r = 555;
        System.out.println(Arrays.toString(solution2(l, r)));
    }

    public static int[] solution2(int l, int r) {
        List<Integer> result = new ArrayList<>();
        generateNumbers(result, l, r, String.valueOf(r).length(), 0, new StringBuilder());

        // 중복 제거
        Set<Integer> set = new HashSet<>(result);
        result = new ArrayList<>(set);

        // 정렬
        Collections.sort(result);

        return result.isEmpty() ? new int[]{-1} : result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void generateNumbers(List<Integer> result, int min, int max, int n, int pos, StringBuilder sb) {
        if (pos > n) {
            return;
        }

        if (pos > 0) {
            int num = Integer.parseInt(sb.toString());
            if (num >= min && num <= max) {
                result.add(num);
            }
        }

        sb.append("0");
        generateNumbers(result, min, max, n, pos + 1, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append("5");
        generateNumbers(result, min, max, n, pos + 1, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
