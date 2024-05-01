package basic;

import notMainClass.Rect;

public class _02 {
    public static void main(String[] args) {
//    2. Rect 클래스를 생성하세요. int width, int height를 필드로 갖고
//    기본생성자와 모든 필드를 초기화하는 생성자 두 개를 정의하세요.
//    그리고 사각형의 둘레를 리턴하는 메소드와 사각형의 넓이를 리턴하는 메소드를 구현하세요.
        Rect re1 = new Rect();
        System.out.println("weight: " + re1.width);
        System.out.println("height: " + re1.height);

        Rect re2 = new Rect(20, 30);
        System.out.println("weight: " + re2.width);
        System.out.println("height: " + re2.height);
        System.out.println("round: " + re2.squareRound());
        System.out.println("area: " + re2.squareArea());
    }



}
