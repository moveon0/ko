package ex2_student;

public class Student {
	String name;//필드
	int age;
	int studentID;
	//this
	//객체 자기 자신을 스스로 참조
	//this 참조변수는 객체가 자기 자신을 참조하는데 사용하는 변수s
	//this를 필드에 붙여서 사용하면 중괄호 안에서도 같은 이름의
	//매개변수와 필드를 구분해서 사용할 수 있다.
	public Student(String name, int age, int studentID) {//매개변수
		this.name = name; //name = name 이라 하면 매개변수 name이 둘 다 들어간다. 그래서 밖으로 전달이 안된다.
		this.age = age;
		this.studentID = studentID;
		
	}
}
