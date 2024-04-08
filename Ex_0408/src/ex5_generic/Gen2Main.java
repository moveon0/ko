package ex5_generic;

public class Gen2Main {
	public static void main(String[] args) {
		Integer[] iArr = {1,2,3,4,5};
		Double[] dArr = {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr = {'A','B','C','D','E'};
		
		Gen gen = new Gen();
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
	}
}
