package notMainClass;

public class Rect {
//    2. Rect 클래스를 생성하세요. int width, int height를 필드로 갖고
//    기본생성자와 모든 필드를 초기화하는 생성자 두 개를 정의하세요.
//    그리고 사각형의 둘레를 리턴하는 메소드와 사각형의 넓이를 리턴하는 메소드를 구현하세요.

    public int width, height;

    public Rect(){

    }

    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int squareRound(){
        return 2 * (this.width + this.height);
    }

    public int squareArea(){
        return this.width * this.height;
    }
}
