package advance;

import notMainClass.UserBook;

public class _01 {
    public static void main(String[] args) {
//        1. UserBook 클래스를 생성하세요.
//        basic 3번 문제에서 만든 User클래스 타입의 값을 100개 저장할 수 있는
//        배열과 현재 배열에 위치를 저장하는 index를 필드로 생성합니다.
//        매개변수로 username과 password를 받아서 User 객체를 생성하여
//        배열에 저장하는 메소드 saveUserInfo를 구현하세요. 이 때 User의 id는
//        index + 1로 지정합니다.

        UserBook userBook = new UserBook();

        userBook.saveUserInfo("김개똥","월월");
        userBook.saveUserInfo("박소똥","음메");
        userBook.saveUserInfo("이말똥","히힝");
        userBook.saveUserInfo("최닭똥","꼭꼬");
        userBook.saveUserInfo("신양똥","매에");

        for(int i = 0; i < userBook.index; i++){
<<<<<<< HEAD
//            System.out.println(userBook.);
=======
//            System.out.println(userBook[i]);
>>>>>>> 430e0da4ad182821990772b5d578c1ba7f2527d4
        } //값 프린트는 못하나....?
    }
}
