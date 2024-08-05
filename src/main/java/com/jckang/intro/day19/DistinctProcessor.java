package com.jckang.intro.day19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 문제 설명<p>
 * 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다.<p>
 * 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후,<p>
 * 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.<p>
 * 이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.<p>
 * 정수 배열 arr 가 주어집니다. 문제에서의 무작위의 수는 arr 에 저장된 순서대로 주어질<p>
 * 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요.<p>
 * 단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.<p>
 * 제한사항<p>
 * 1 ≤ arr 의 길이 ≤ 100,000<p>
 * 0 ≤ arr 의 원소 ≤ 100,000<p>
 * 1 ≤ k ≤ 1,000<p>
 * 입출력 예<p>
 * arr	                k	result<p>
 * [0, 1, 1, 2, 2, 3]	3	[0, 1, 2]<p>
 * [0, 1, 1, 1, 1]	    4	[0, 1, -1, -1]<p>
 * 입출력 예 설명<p>
 * 입출력 예 #1<p>
 * 앞에서부터 서로 다른 k개의 수를 골라내면 [0, 1, 2]가 됩니다. 따라서 [0, 1, 2]를 return 합니다.<p>
 * 입출력 예 #2<p>
 * 서로 다른 수의 개수가 2개 뿐이므로 서로 다른 수들을 앞에서부터 차례대로 저장한<p>
 * [0, 1]에서 이후 2개의 인덱스를 -1로 채워넣은 [0, 1, -1, -1]을 return 합니다.
 */
public class DistinctProcessor {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;
        int[] expected = {0, 1, 2};
        int[] result = solution(arr, k);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr, int k) {
        List<Integer> arrList = Arrays.stream(arr)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            if (i < arrList.size()) {
                result[i] = arrList.get(i);
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}
