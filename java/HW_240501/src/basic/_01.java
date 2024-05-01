package basic;

import notMainClass.SmartPhone;

public class _01 {
    public static void main(String[] args) {
//        1. SmartPhone 클래스를 생성하고 속성 세 개와 기능 세 개를 자유롭게 만들어보세요.
        SmartPhone ph = new SmartPhone();

        ph.company = "삼성";
        ph.series = "갤럭시";
        ph.year = 2024;
        ph.price = 1130000;

        ph.phoneInfo();

        ph.turnOn();
        ph.netWork();
        ph.turnOff();
    }
}
