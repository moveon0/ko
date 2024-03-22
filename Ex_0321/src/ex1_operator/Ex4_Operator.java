package ex1_operator;

public class Ex4_Operator {
	public static void main(String[] args) {
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//++, --
		
		//선행증감연산자
		//변수의 앞에 사용
		int a = 10;
		System.out.println("a : "+ ++a);
		
		//후행증감연산자
		//변수의 뒤에 사용
		int b = 10;
		System.out.println("b : "+ b++);
		System.out.println(b);
		
		int x = 5;
		
		int y = 7;
		
		int z = x + y++;
		System.out.println(z);
		
		//연산을 모두 마친 후 x,y,z의 값은 각각 무엇인가?
		//x : 5
		//y : 8
		//z : 12
		
		x = 8;
		y = 3;
		z = x++ + --y - ++x + --x + y++;
		System.out.println(z);
		
		
	}
}
