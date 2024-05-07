package middle;

public class _03 {
    public static void main(String[] args) {
        int money = 10000;
        int rateYear = 10;
        int year = 10;

        int resultMoney = (int) (money * Math.pow(1 + (double)rateYear / 100, year));

        System.out.println(resultMoney);
    }
}
