package ex5_generic;

public class GenMain {
	public static void main(String[] args) {
		GenEx<String> v1 = new GenEx<>();
		v1.setValue("문자열");
		
		System.out.println(v1.getValue());
		
		//제네릭타입은 기본 자료형을 인식하지 않는다.ㄴ
		//따라서 Wrapper클래스를 사용해야 한다.
		GenEx<Integer> v2 = new GenEx<>();
		v2.setValue(100);
		System.out.println(v2.getValue()+1);//형변환이 필요없음
		
		GenEx<Character> v3 = new GenEx<>
();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
		}
}
