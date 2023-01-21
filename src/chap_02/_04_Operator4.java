package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자 ,  || = or , && = and
        boolean 김치찌개1 = true; // 김치찌개가 있다
        boolean 계란말이1 = true;
        boolean 제육볶음1 = true;

        System.out.println(김치찌개1 || 계란말이1 || 제육볶음1); // 하나라도 있으면 개꿀식당 하지만 다있네? 경우 true

        boolean 김치찌개2 = false; // 김치찌개가 있다
        boolean 계란말이2 = false;
        boolean 제육볶음2 = true;

        // or 연산
        System.out.println(김치찌개2 || 계란말이2 || 제육볶음2); // 하나라도 있다면 개꿀식당 근데 3개중 한개가있네? 꿀식당 true

        boolean 김치찌개3 = true; // 김치찌개가 있다
        boolean 계란말이3 = true;
        boolean 제육볶음3 = true;


        // and 연산
        System.out.println(김치찌개3 && 계란말이3 && 제육볶음3); // 난 돼지세끼라 다먹어야함 다있어야 true

        System.out.println((5 > 3) && (3 > 1)); // 5 는 3보다 크고 , 3 은 1보다 크다 true
        System.out.println((5 > 3) && (3 < 1)); // 5 는 3 보다 크고, 3은 1 보다 작다 false

        System.out.println((5 < 3) || (2 > 1)); // true
        System.out.println((5 < 3) || (2 < 1)); // false

        // 논리 부정 연산자

        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); // true



    }
}
