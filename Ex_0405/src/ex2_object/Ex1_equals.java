package ex2_object;
/*
 * 기본 API 클래스
 * 
 * 자바에서 제공하는 API는 프로그램에 자주 사용되는 클래스 및 인터페이스
 * 
 * -java.lang 패키지
 * 
 * 자바 프로그램의 기본적인 클래스를 담고 있는 패키지이다.
 * 
 * 		클래스						용도
 * 	Object				자바 클래스의 최상위 클래스로 사용
 * 	System				시스템의 표준 입/출력 장치로부터 데이터를 받거나 출력하기 위해 사용
 *  String				문자열을 저장하고 여러가지 정보를 얻을 때 사용
 *  StringBuffer/StringBuilder	문자열을 저장하고 내부 문자열을 조작할 때 사용
 *  Math				수학 함수를 이용할 때 사용	
 *  
 *  
 *  -Object
 *  자바의 최상위 클래스
 *  자바에서 생성되는 모든 클래스는 상속을 하지 않더라도 Object를 자동으로 상속받는다.
 *  따라서 클래스를 생성하면 Object가 가지고 있는 여러 메서드를 그대로 사용하거나 오버라이딩하여 사용할 수 있다.
 *  
 */
public class Ex1_equals {
	public static void main(String[] args) {
		//equals() 메서드
		//기본 자료형으 ㅣ데이터들을 비교하기 위해 ==연산자를 사용한다.
		//하지만 객체를 비교할 때는 주소값을 비교한다.
		//객체들의 값을 비교하고 싶을 때는 equals() 메서드를 오버라이딩하여 사용한다.
		
		//묵시적 객체 생성 
		String str1 = "hello"; //값이 같으면 str2가 str1을 참조해 주소가 같다고 나온다.
		String str2 = "hello";
		//명시적 객체 생성
		String str3 = new String ("hello");//new 로 생성했기 때문에 새로 메모리에 올라간다.
		
		System.out.println("str1 vs str2 : " + (str1 ==str2));
		System.out.println("str1 vs str3 : " + (str2 == str3));
		
		//System.identifyHashCode()
		//객체의 고유한 hashcode를 리턴하는 메서드
		System.out.println("str1 : "+ System.identityHashCode(str1));
		System.out.println("str2 : "+ System.identityHashCode(str2));
		System.out.println("str3 : "+ System.identityHashCode(str3));
		
		//객체에 들어있는 값을 비교
		System.out.println("str1 vs str2 : " + str1.equals(str2));
		System.out.println("str1 vs str3 : " + str1.equals(str3));//값 비교여서 true가 나옴
	}
}
