package ex2_annoymous;
interface buttonClickListener{
	public void click();
}
public class AnnoymousExample {
	public class Button{//인스턴스클래스
		private buttonClickListener listener;
		
		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}
		//버튼클릭 기능
		public void click() {
			if (listener != null) {
				this.listener.click();
			}
		}
	}
	public static void main(String[] args) {
		AnnoymousExample exam = new AnnoymousExample();//외부 클래스 객체
		AnnoymousExample.Button button = exam.new Button();//내부 클래스 객체
		button.setButtonListener(new buttonClickListener() {//익명 클래스
			
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
				
			}
		});
		//버튼을 누름
		button.click();
	}
}


