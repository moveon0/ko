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
}
