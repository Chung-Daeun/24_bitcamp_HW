package notMainClass;

public class SmartPhone {

    public String company;
    public String series;
    public int year;
    public int price;

    public void phoneInfo(){
        System.out.println(this.company + "의 " + this.series);
        System.out.println(this.year+"년도 제품이며, " + this.price + "에 구매가능");
    }

    public void turnOn(){
        System.out.println("전원이 켜졌습니다.");
    }

    public void turnOff(){
        System.out.println("전원이 꺼졌습니다.");
    }

    public void netWork(){
        System.out.println("인터넷에 연결되었습니다.");
    }
}
