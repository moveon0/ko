package ex5_generic;

public class DataListExample {
	public static void main(String[] args) {
		DataList list = new DataList();
		
		//정수저장
		list.add(10);
		
		//문자열저장
		list.add("문자열");
		
		//실수 저장
		list.add(10.33);
		
		//데이터의 출력
		for(int i = 0; i < list.size();i++) {
			Object data = list.get(i);//data에 자동으로 형변환ㄴ
			
			if(data instanceof Integer) {
				System.out.println("정수 : "+(((int)data+1)));//data 가 Object 타입이므로 정수와 더하려면 int형으로 변환
			} else if(data instanceof Double) {
				System.out.println("실수 : "+data);
			} else if(data instanceof String) {
				System.out.println("문자열 : "+data);
			}
			
			//Object는 최상위 클래스이기 때문에 모든 타입의 데이터가 들어올 수 있다.
			//뭐가 들어있는지 모르는 경우가 있을 수 있다.
			//형변환을 하는 과정을 거쳐야 하는데 잘못 형변환을 하게 되면 오류가 난다.
			 
		}
	}
}
