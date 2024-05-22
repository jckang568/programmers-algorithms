package com.jckang.intro.day10;

import java.util.ArrayList;
import java.util.List;

public class QRCode {
    public static void main(String[] args) {
        int q = 3, r = 1;
        String code = "qjnwezgrpirldywt";
        System.out.println(solution(q, r, code));
        List<String> list = new ArrayList<>();
        list.add("asdf");
        var firstOrDefault = list.stream().findFirst().orElse("abc");
        System.out.println(firstOrDefault);
    }

    private static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for(int i = r; i < code.length() ; i += q) {
            sb.append(code.charAt(i));
        }
        return sb.toString();
    }
}
