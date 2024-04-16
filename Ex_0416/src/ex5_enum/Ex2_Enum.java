package ex5_enum;

public class Ex2_Enum {
	public static void main(String[] args) {
		//Item item = new Item();//열거형의 생성자는 외부에서 호출 불가
		Item start = Item.START;
		String str = start.getItem();
		System.out.println(str);
		System.out.println("-------------");
		
		Item[] items = Item.values();
		
		for(Item item : items) {
			System.out.println("이름 : " +item.getItem()+" 심볼 : "+item.getSymbol());
		}
	}
}
