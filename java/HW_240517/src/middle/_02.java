package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		Stream<Student> goodStudent = studentList.stream().filter(student -> student.getScore() >= 95);
		
		goodStudent.map(stu -> {
									stu.setGrade("A+");
									return stu;
								})
					.forEach(stu -> System.out.println(stu));
	}

}
