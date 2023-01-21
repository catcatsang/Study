package chap_01;

import javax.swing.*;

public class _07_typeCasting {
    public static void main(String[] args) {

        // int to float, double
        int score = 93;
        float score_f = 93.5F;
        double score_d = 98.8;

        System.out.println(score);
        System.out.println((double) score);
        System.out.println((float) score);
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        //정수와 실수 연산
        score = 93 + (int)98.8; // 이세낀 정수임. 왜냐면 인트로 변환시켜줫기때문 그래서 .8을 버림
        score_d = 98 + 93.7; // 이세끼도 실수임
        score_f = (int)98.3f + (int) 93.7; //실수

        System.out.println(score_f);

        double convertedScoreDouble = score; // convertedScoreDouble = score 얜 실수임
        // int -> long -> float -> double (자동형변환)

        int convertedScoreInt = (int) score_d;
        //double _> float -> long -> int (수동변환)

        // 숫자를 문자로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = "앙기모찌";
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        //int error = Integer.parseInt("자바");








        }
}















