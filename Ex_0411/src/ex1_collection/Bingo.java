package ex1_collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Random;

//HashSet과 ArrayList를 이용해서 5 * 5의 랜덤빙고판 만들기
//1~50까지 25개를 뽑아 랜덤으로 배치

//요소 섞기
//Collections.shuffle(리스트);
public class Bingo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		while(true) {
			set.add(new Random().nextInt(50)+1);
			if(set.size() == 25) {
				break;
			}
		}
		
		List <Integer> list = new ArrayList<>(set);
		
		Collections.shuffle(list);
		
		int [][] board = new int[5][5];
		
		Iterator <Integer> iter = list.iterator();
		for(int i = 0; i < board.length; i++) {
			for( int j = 0; j < board[i].length; j++) {

				board[i][j] = iter.next();//board에 list값을 넣음
				
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
	}
}