package middle;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> 430e0da4ad182821990772b5d578c1ba7f2527d4
import notMainClass.PhoneInfo;

public class _01 {
    public static void main(String[] args) {
        //    1. PhoneInfo 클래스를 생성하세요.
<<<<<<< HEAD
    	
    	// 과제 중 내가 출력한 코드
//        PhoneInfo phoneInfo = new PhoneInfo();
//
//        phoneInfo.insertPhoneInfo("김개똥","01012341234");
//        phoneInfo.insertPhoneInfo("박말똥","01056785678");
//        phoneInfo.insertPhoneInfo("이소똥","01012345678");
//        phoneInfo.insertPhoneInfo("최닭똥","01098765432");
//        phoneInfo.insertPhoneInfo(sc.next(),sc.next());
//        
//
//        phoneInfo.printAllPhoneInfo();
//        System.out.println();
//        phoneInfo.printPhoneInfo(2);
    	
    	Scanner sc = new Scanner(System.in);
    	PhoneInfo phoneInfo = new PhoneInfo();
    	
    	while(true) {
    		System.out.println("\n-------연락처-------");
    		System.out.println("1. 연락처 입력");
    		System.out.println("2. 모든 연락처 출력");
    		System.out.println("3. 인덱스로 연락처 겁색");
    		System.out.println("4. 종료");
    		
    		int menuSelect = sc.nextInt();
//    		sc.nextLine();
    		boolean isExit = false;
    		
    		switch(menuSelect) {
    			case 1:
    				System.out.println("이름을 입력하세요.");
    				String name = sc.next();
    				System.out.println("번호를 입력하세요.");
    				String phoneNum = sc.next();
    				phoneInfo.insertPhoneInfo(name, phoneNum);
    				break;
    			case 2:
    				phoneInfo.printAllPhoneInfo();
    				break;
    			case 3:
    				System.out.println("검색할 연락처의 인덱스를 입력하세요.");
    				int index = sc.nextInt();
    				phoneInfo.printPhoneInfo(index);
    				break;
    			case 4:
    				System.out.println("프로그램을 종료합니다.");
    				isExit = true;
    				break;
     		}
    		if(isExit) {
    			break;
    		}
    	}
    	sc.close();
=======
        PhoneInfo phoneInfo = new PhoneInfo();

        phoneInfo.insertPhoneInfo("김개똥","01012341234");
        phoneInfo.insertPhoneInfo("박말똥","01056785678");
        phoneInfo.insertPhoneInfo("이소똥","01012345678");
        phoneInfo.insertPhoneInfo("최닭똥","01098765432");

        phoneInfo.printAllPhoneInfo();
        System.out.println();
        phoneInfo.printPhoneInfo(2);
>>>>>>> 430e0da4ad182821990772b5d578c1ba7f2527d4
    }
}
