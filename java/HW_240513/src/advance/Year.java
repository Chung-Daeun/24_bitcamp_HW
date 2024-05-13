package advance;

//1. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때 그 달의 일수 두 번째 값은 윤년일 때 그 달의 일수로 설정하고 
//사용자가 년도를 입력하면 해당 년도의 1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요. sumDays(int year)

public enum Year {

	JAN(31, 31),
	FEB(28, 29),
	MAR(31, 31),
	APR(30, 30),
	MAY(31, 31),
	JUN(30, 30),
	JUL(31, 31),
	AUG(31, 31),
	SEP(30, 30),
	OCT(31, 31),
	NOV(30, 30),
	DEC(31, 31);
	
	int dayInOrdinaryYear;
	int dayInLeapYear;
	
	Year(int dayInOrdinaryYear, int dayInLeapYear){
		this.dayInOrdinaryYear = dayInOrdinaryYear;
		this.dayInLeapYear = dayInLeapYear;
	}
	
	public int getDayInOrdinaryYear() {
		return dayInOrdinaryYear;
	}
	public int getDayInLeapYear() {
		return dayInLeapYear;
	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	
	public void sumDays(int year) {
		Year[] numOfDay = Year.values();
		int sum = 0;
		
		if(Year.isLeapYear(year)) {
			for(int i = 0; i < 5; i++) {
				sum += numOfDay[i].dayInLeapYear;
			}
		} else {
			for(int i = 0; i < 5; i++) {
				sum += numOfDay[i].dayInOrdinaryYear;
			}
		}
		System.out.println(year + "년의 1 ~ 5월은 총 " + sum + "일 입니다.");
	
	}
}
