package basic;

import notMainClass.User;

public class _03 {
//    3. User 클래스를 생성하세요. long id, String username, String password를 필드로 가지고
//    getter, setter 메소드를 구현하세요. id, username, password 필드는 private으로 지정합니다.
    public static void main(String[] args) {
        User user = new User();

        user.setter(990113, "ChungDaeun", "lovely");
        System.out.println("Id: " + user.getId() + ", username: " + user.getUsername() + ", password: " + user.getPassword());
    }
}
