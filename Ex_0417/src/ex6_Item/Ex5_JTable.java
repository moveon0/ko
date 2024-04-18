package ex6_Item;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Ex5_JTable {
	public static void main(String[] args) {
		//JTable 클래스는 데이터를 테이블 형태인 행과 열로 나타내고자 할때 사용
		//JTable 클래스로 나타낸 테이블ㄹ에서 행은 마우스를 이용하여 경계선을 조정하고
		//위치를 바꿀 수 있다.
		
		JFrame f = new JFrame("테이블만들기");
		f.setLayout(new BorderLayout());
		
		String[] title = {"사번","이름","부서"};
		String[][] data = {{"1","홍길동","개발팀"},{"2","제임스","인사팀"},{"3","왓슨","전산과"}};
		JTable table = new JTable(data, title);
		
		f.add(table,BorderLayout.CENTER);
		
		
		f.setBounds(400,400,302,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
