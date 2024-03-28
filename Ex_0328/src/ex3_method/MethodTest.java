package ex3_method;

public class MethodTest {
	public int add(int su1, int su2) {
		int a = su1 + su2;
		return a;
		
	}
	
	// 1~n 까지 총합을 구해서 출력하는 함수 sum 작성하기
	
	public void sum(int n) {
		int total=0;
		for (int i = 1; i < n+1; i++) {
			total += i;
		}
		System.out.println("총합 : "+total);
	}
	
	//배열의 최대값을 찾는 maxFinder메서드
	
	public int maxFinder(int [] arr) {
		int max=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} 
			
		}
		return max;
	}
	
	//main에서 반지름을 전달받아 원의 넓이를 구하는 circleArea
	//원의 넓이(r*r*3.14)
	
	public double circleArea(double r) {
		return r*r*3.14;
	}
	
	
	//main에서 반지름을 전달받아 원의 둘레를 구하는 circleRound
	//원의 둘레(2*3.14*r)
	
	public double circleRound(double r) {
		return 2*r*3.14;
	}
}
