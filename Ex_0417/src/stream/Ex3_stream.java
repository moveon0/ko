package stream;

import java.util.Arrays;

public class Ex3_stream {
	public static void main(String[] args) {
		int[] nums = {1, 23, 23, 23423, 234, 234134, 114124, 124123, 1243, 1,  3, 5,1,1,1,1};
		Arrays.stream(nums)
		.distinct()
		.sorted()
		.limit(5)              
		.forEachOrdered(x -> System.out.print(x+" "));
		
		System.out.println();
		System.out.println(Arrays.toString(nums));//원본안바뀜
	}
}
