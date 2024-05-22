package com.jckang.intro.day8;

import java.util.*;

public class DiceGame3 {
    public static void main(String[] args) {
        int a = 4, b = 1, c = 4, d = 4;
        int a2 = 6, b2 = 3, c2 = 3, d2 = 6;
        int a3 = 2, b3 = 5, c3 = 2, d3 = 6;
        int a4 = 2, b4 = 3, c4 = 6, d4 = 6;
        int test2 = 6;
        int test3 = 3;
        System.out.println(test2 ^= 3);
        System.out.println(test3 |= 6);
        System.out.println(solution(a, b, c, d));
        System.out.println(solution(a2, b2, c2, d2));
        System.out.println(solution(a3, b3, c3, d3));
        System.out.println(solution(a4, b4, c4, d4));
        int[] test = {1, 2, 3, 4};
        char[] tt = {'a', 'b', 'c', 'd'};
        char c1 = '8';
        int i1 = Integer.parseInt(String.valueOf(c1));

    }

    private static int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        if (a == b && a == c && c == d) {
            return 1111 * a;
        } else if (a == b && b == c && c != d || a == b && b == d && c != d || b == c && c == d && a != b || a == c && c == d && a != b) {
            Map<Integer, Integer> map = new HashMap<>();
            int same = 0;
            int diff = 0;
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    diff = key;
                } else {
                    same = key;
                }
            }
            return (10 * same + diff) * (10 * same + diff);
        } else if (a == b && c == d && a != c || a == c && b == d && b != c || a == d && b == c && a != b) {
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }
            Integer result = set.stream()
                    .flatMap(n1 -> set.stream().map(n2 -> new int[]{n1, n2}))
                    .filter(pair -> pair[0] != (pair[1]))
                    .map(pair -> (pair[0] + pair[1]) * (pair[0] - pair[1]))
                    .findFirst()
                    .orElse(0);

            return Math.abs(result);
        } else if (a == b && b != c && c != d || a == c && b != c && c != d || a == d && a != b && b != c || b == c && a != b && a != d || b == d && a != b && a != c || c == d && a != c && a != b) {
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    list.add(key);
                }
            }
            return list.stream().reduce(1, (other1, other2) -> other1 * other2);
        } else {
            return Arrays.stream(arr).min().getAsInt();
        }
    }
}
