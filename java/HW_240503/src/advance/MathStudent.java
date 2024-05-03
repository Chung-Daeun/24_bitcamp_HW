package advance;

public class MathStudent extends CommonStat implements Student {

	
	public MathStudent() {
		super();
	}
	

	public MathStudent(int sno, String name) {
		super(sno, name);
	}



	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
		this.subject[index] = subject;
		this.finalExamScore[index] = score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("학번: " + this.sno);
		System.out.println("이름: " + this.name);
		
		System.out.print("과목: ");
		for(String sub: this.subject) {
			System.out.print(sub + " ");
		}
		
		System.out.println("점수: ");
		for(int num : this.finalExamScore) {
			System.out.println(num + " ");
		}
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int score : finalExamScore) {
			sum += score;
		}
		return (double)sum / finalExamScore.length;
	}

}
