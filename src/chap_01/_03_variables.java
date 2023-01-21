package chap_01;

public class _03_variables {
    public static void main(String[] args) {
        String name;
        name = "세웅";
        int hour = 15;

        System.out.println(name + "씨 배송이 시작됩니다. " + hour + "시에 도착할 예정입니다");
        System.out.println(name + "씨 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';

        System.out.println(name + "씨의 점수는 " + score);

        boolean pass = true;
        System.out.println("이번시험에 합격을 했을까요?" + pass );


        double d = 3.14;
        float f = 3;



        long p = 1000000000000L;
        p = 1_000_000_000_000L;

        System.out.println(p);

      //  int, boolean, double, float, char, String, long,


    }
}
