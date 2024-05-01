package middle;

import notMainClass.PhoneInfo;

public class _01 {
    public static void main(String[] args) {
        //    1. PhoneInfo 클래스를 생성하세요.
        PhoneInfo phoneInfo = new PhoneInfo();

        phoneInfo.insertPhoneInfo("김개똥","01012341234");
        phoneInfo.insertPhoneInfo("박말똥","01056785678");
        phoneInfo.insertPhoneInfo("이소똥","01012345678");
        phoneInfo.insertPhoneInfo("최닭똥","01098765432");

        phoneInfo.printAllPhoneInfo();
        System.out.println();
        phoneInfo.printPhoneInfo(2);
    }
}
