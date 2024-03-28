package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
		int su1 = 1;
		int su2 = 2;
		
		MethodTest mt = new MethodTest();
		
		int a=mt.add(su1, su2);
		System.out.println(a);
		
		mt.sum(5);
		int [] arr = {3,6,1,2,5};
		
		System.out.println(mt.maxFinder(arr));
	}
}
