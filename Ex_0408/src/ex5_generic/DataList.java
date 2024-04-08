package ex5_generic;
//컬렉션 프레임워크

/*
 * 배열은 한 번 정한 크기를 변경하거나 삭제할 수 없다.
 * 또한 별도의 기능이 없기 때문에 직접 index를 이용해 데이터를 저장해야 한다.
 * 
 * 자바는 이러한 불편함을 해결하기 위해 필요한 자료구조를 미리 구현하여
 * java.util 패키지에서 제공하고 있다.
 * 
 * 컬렉션은 기존에 있던 자료구조 List, Queue, Tree 등의 자료구조를 의미한다.
 * 프레임워크는 클래스와 인터페이스를 묶어놓은 개념이다.
 * 
 * List : 순서가 있는 데이터의 집합		데이터 중복 허용
 * Set : 순서가 없는 데이터의 집합		데이터 중복 허용 x
 * Map : 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합
 * 
 * -제네릭
 * 
 * 일반적인(범용성있는) 코드를 작성하고 이 코드를 다양한 타입의 객체에 대하여 재사용하는 객체지향기법
 * 객체의 타입을 컴파일할 때 체크하기 때문에 객체의 타입에 대해 안정성을 높히고
 * 형변환을 하는 번거로움을 줄일 수 있다.
 * jdk1.5부터 도입된 제네릭을 사용하면 컴파일할 때 미리 타입이 정해지므로
 * 타입 검사나 변환과 같은 번거로운 작업을 생략할 수 있다.
 */
public class DataList {
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public DataList() {
		data = new Object[defaultSize];
	}
	
	public DataList(int size) {
		data = new Object[size];
	}
	
	public void add(Object value) {
		data[size++] = value;
	}
	
	public Object get(int index) {
		return data[index];
	}
	
	public int size() {
		return size;
	}
}
