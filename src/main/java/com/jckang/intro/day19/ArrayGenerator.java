package com.jckang.intro.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 설명<p>
 * 0과 1로만 이루어진 정수 배열 arr 가 주어집니다. arr 를 이용해 새로운 배열 stk 을 만드려고 합니다.<p>
 * i의 초기값을 0으로 설정하고 i가 arr 의 길이보다 작으면 다음을 반복합니다.<p>
 * 만약 stk 이 빈 배열이라면 arr[i]를 stk 에 추가하고 i에 1을 더합니다.<p>
 * stk 에 원소가 있고, stk 의 마지막 원소가 arr[i]와 같으면 stk 의 마지막 원소를 stk 에서 제거하고 i에 1을 더합니다.<p>
 * stk 에 원소가 있는데 stk 의 마지막 원소가 arr[i]와 다르면 stk 의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.<p>
 * 위 작업을 마친 후 만들어진 stk 을 return 하는 solution 함수를 완성해 주세요.<p>
 * 단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.<p>
 * 제한사항<p>
 * 1 ≤ arr 의 길이 ≤ 1,000,000<p>
 * arr 의 원소는 0 또는 1 입니다.<p>
 * 입출력 예<p>
 * arr	            result<p>
 * [0, 1, 1, 1, 0]	[0, 1, 0]<p>
 * [0, 1, 0, 1, 0]	[0, 1, 0, 1, 0]<p>
 * [0, 1, 1, 0]	    [-1]<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * 각 작업을 마친 후에 배열의 변화를 나타내면 다음 표와 같습니다.<p>
 * idx	arr[idx]	stk<p>
 * 0	0	        []<p>
 * 1	1	        [0]<p>
 * 2	1	        [0, 1]<p>
 * 3	1	        [0]<p>
 * 4	0	        [0, 1]<p>
 * 5	-	        [0, 1, 0]<p>
 * 따라서 [0, 1, 0]을 return 합니다.<p>
 * 입출력 예 #2<p>
 * 각 작업을 마친 후에 배열의 변화를 나타내면 다음 표와 같습니다.<p>
 * idx	arr[idx]	stk<p>
 * 0	0	        []<p>
 * 1	1	        [0]<p>
 * 2	0	        [0, 1]<p>
 * 3	1	        [0, 1, 0]<p>
 * 4	0	        [0, 1, 0, 1]<p>
 * 5	-	        [0, 1, 0, 1, 0]<p>
 * 따라서 [0, 1, 0, 1, 0]을 return 합니다.<p>
 * 입출력 예 #3<p>
 * 각 작업을 마친 후에 배열의 변화를 나타내면 다음 표와 같습니다.<p>
 * idx	arr[idx]	stk<p>
 * 0	0	        []<p>
 * 1	1	        [0]<p>
 * 2	1	        [0, 1]<p>
 * 3	0	        [0]<p>
 * 4	-	        []<p>
 * 마지막에 빈 배열이 되었으므로 [-1]을 return 합니다.
 */
public class ArrayGenerator {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};
        int[] expected = {0, 1, 0};
        int[] solution = solution(arr);
        System.out.println(Arrays.equals(expected, solution));
    }

    private static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.isEmpty() && arr[i] == list.get(list.size() - 1)) {
                list.remove(list.size() - 1);
            } else {
                list.add(arr[i]);
            }
        }
        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
    }
}
