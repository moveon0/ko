package ex3_bread;

//Bread 클래스를 만들어 각기 다른 기능을 하는 makeBread()메서드를 3개 만든다.
//메인 클래스에서 각각의 메서드를 호출했을 때 결과를 보고 로직을 구현해보자.

//빵을 만들었습니다. -> 메서드 1
//----------------
//빵을 만들었습니다.
//빵을 만들었습니다.
// ... 
//요청하신 n개의 빵을 만들었습니다. -> 메서드 2
//----------------

//xx빵을 만들었습니다.
//xx빵을 만들었습니다.
//...
//요청하신 xx빵을 n개 만들었습니다. -> 메서드 3

public class BreadMain {
	public static void main(String[] args) {
		
		Bread b = new Bread();
		b.makebread();
		System.out.println("-------------");
		b.makebread(5);
		System.out.println("-------------");
		b.makebread(5,"메론");
	}
}
