package com.jckang.intro.day12;

import java.util.Arrays;

public class ArraySplitter {
    public static void main(String[] args) {
        /*
        정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
        slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.

        n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
        n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
        n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
        n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
        올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.

        n	slicer	    num_list	                result
        3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 3, 4, 5, 6]
        4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 4, 6]
         */
        int n1 = 1;
        int[] slicer1 = {6, 7, 3};
        int[] numList1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] expect1 = {1, 2, 3, 4, 5, 6, 7};

        int n2 = 2;
        int[] slicer2 = {2, 6, 3};
        int[] numList2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] expect2 = {3, 4, 5, 6, 7, 8, 9};

        int n3 = 3;
        int[] slicer3 = {2, 9, 2};
        int[] numList3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] expect3 = {3, 4, 5, 6, 7, 8, 9, 10};

        int n4 = 4;
        int[] slicer4 = {9, 10, 1};
        int[] numList4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] expect4 = {2, 3,4,5,6,7,8,9,10,11};

        int n5 = 4;
        int[] slicer5 = {1, 6, 3};
        int[] numList5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expect5 = {2, 5};


        int[] result1 = solution(n1, slicer1, numList1);
        int[] result2 = solution(n2, slicer2, numList2);
        int[] result3 = solution(n3, slicer3, numList3);
        int[] result4 = solution(n4, slicer4, numList4);
        int[] result5 = solution(n5, slicer5, numList5);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.equals(expect1, result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.equals(expect2, result2));
        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.equals(expect3, result3));
        System.out.println(Arrays.toString(result4));
        System.out.println(Arrays.equals(expect4, result4));
        System.out.println(Arrays.toString(result5));
        System.out.println(Arrays.equals(expect5, result5));


    }

    private static int[] solution(int n, int[] slicer, int[] numList) {
        int[] result;
        switch (n) {
            case 1:
                result = new int[slicer[1] + 1];
                System.arraycopy(numList, 0, result, 0, slicer[1] + 1);
                return result;
            case 2:
                result = new int[numList.length - slicer[0]];
                System.arraycopy(numList, slicer[0], result, 0, numList.length - slicer[0]);
                return result;
            case 3:
                result = new int[slicer[1] - slicer[0] + 1];
                System.arraycopy(numList, slicer[0], result, 0, slicer[1] - slicer[0] + 1);
                return result;
            case 4:
                int resultLength = (slicer[1] - slicer[0] + 1) % slicer[2] == 0 ? (slicer[1] - slicer[0] + 1) / slicer[2] : (slicer[1] - slicer[0] + 1) / slicer[2] + 1;
                result = new int[resultLength];
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    result[(i - slicer[0]) / slicer[2]] = numList[i];
                }
                return result;
        }
        result = new int[0];
        return result;
    }
}
