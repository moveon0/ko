package ex2_multi_array;
import java.util.Arrays;
public class Ex1_multi_array {
	public static void main(String[] args) {
		//다차원 배열
		//2차원 이상의 배열을 의미하며, 배열의 요소로 또 다른 배열을 가지는 것을 의미
		//2차원 배열은 1차원 배열을 요소로 갖고,
		//3차원 배열은 2차원 배열을 요소로 갖는다.
		
		//2차원 배열의 선언과 생성
		//1차원 배열의 선언 방법과 근본적으로 동일
		//다만 대괄호가 하나 더 추가된다.
		
		//자료형[][] 배열명 = new 자료형 [1차원 배열의 개수][1차원 배열의 요소]
		int [][] arr = new int [2][3];
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		System.out.println(Arrays.deepToString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			for ( int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println("--------------");
		
		//2차원 배열은 다음과 같이 1차원 배열의 요소의 개수를 지정하지 않고 
		//생성할 수 있다.
		
		int[][] arr2 = new int [2][];
		
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		int n = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print((arr[i][j] = (n+=100))+" ");
			}
			System.out.println();
		}
		
		
	}
}
