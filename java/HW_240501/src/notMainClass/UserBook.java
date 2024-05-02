package notMainClass;

public class UserBook {
//        1. UserBook 클래스를 생성하세요.
//        basic 3번 문제에서 만든 User클래스 타입의 값을 100개 저장할 수 있는
//        배열과 현재 배열에 위치를 저장하는 index를 필드로 생성합니다.
//        매개변수로 username과 password를 받아서 User 객체를 생성하여
//        배열에 저장하는 메소드 saveUserInfo를 구현하세요. 이 때 User의 id는
//        index + 1로 지정합니다.

    User[] users = new User[100];
<<<<<<< HEAD
    // 여기부터 아예 잘못 짬
    public int index = 0;

    public void saveUserInfo(String username, String password){
    	User user = new User();
    	
        user.setter(index + 1, username, password);
        this.users[index++] = user;
    }
    
    // (수업중)출력함수 생성
    public void printUserInfo(int index) {
    	if(users[index] != null) {
    		System.out.println("id: " + users[index].getId() + ", username: " + users[index].getUsername() +
    							", password: " + users[index].getPassword());
    	} else {
    		System.out.println("해당 인덱스에 저장된 데이터가 없습니다.");
    	}
=======
    public int index;

    public void saveUserInfo(String username, String password){
        this.users[index].setter(index + 1, username, password);
        index++;
>>>>>>> 430e0da4ad182821990772b5d578c1ba7f2527d4
    }
}
