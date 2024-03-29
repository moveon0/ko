package work;
import java.util.Random;
//Graph라는 이름의 메인 클래스를 만들어 
//0~9사이의 난수를 100개 저장하는 배열을 만들고
//해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프s
//단,발생한 난수의 그래프화 작업은 PrintGraph 클래스가 하도록 한다.
public class Graph {
	public static void main(String[] args) {
		Random rand = new Random();
		PrintGraph pg = new PrintGraph();
		int [] arr = new int [100];
		for (int i = 0; i < arr.length; i++) {
			int n = rand.nextInt(10);
			arr[i] = n;
		}
		
		pg.PrintGraph(arr);
	}
}
