package ex5_enum;
//열거형

/*
* 상수를 가지고 생성되는 객체들을 한 곳에 모아둔 하나의 묶음ㄴ
* index값을 가진다.
* 클래스처럼 보이게 하는 상수
* 서로 관련 있는 상수들을 모아 정의
*/
public enum Item {START("시작","s"),STOP("멈춤","p"),EXIT("종료","e");
	
	
	protected String itemStr;
	protected String symbol;
	//생성자
	Item(String itemStr,String symbol){//<-여기로 시작, 멈춤, 종료가 들어감
		this.itemStr= itemStr;
		this.symbol= symbol;
	}
	public String getSymbol() {
		return symbol;
	}
	
	public String getItem() {
		return itemStr;
	}
}

	

//Enum 클래스가 컴파일될 때 자동으로 추가되는 메서드
//name() : 열거형 상수의 이름을 문자열로 반환
//ordinal() : 열거형 상수가 정의된 순서를 반환
//valueof("상수명") : String 값을 enum에서 가져온다. 값이 없으면 예외를 발생시킨다.
//valueof(Item.class(메타데이터 클래스의 정보), "상수명") : 넘겨받은 class에서 상수명을 찾아서 가져온다.
//values() : 열거형 상수 안에 들어있는 내용들을 enum타입의 배열로 반환
