package ex6_annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@TestInfo(tester = "홍길동", datetime = @Datetime(date = "20240417", time = "192108")) 
//value = 을 통해 TestInfo의 value()메서드에 정보가 저장된다.
//value = 은 생략이 가능하다.
public class Ex1_annotation {
	public static void main(String[] args) {
		Annotation[] annos = Ex1_annotation.class.getAnnotations();
		
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		
		TestInfo testInfo = Ex1_annotation.class.getAnnotation(TestInfo.class);
		String [] arr = testInfo.value();
		System.out.println(Arrays.toString(arr));
		
		String[] tools = testInfo.testTool();
		System.out.println(Arrays.toString(tools));
		
		String tester = testInfo.tester();
		System.out.println(tester);
		
		String date = testInfo.datetime().date();
		String time = testInfo.datetime().time();
		System.out.printf("date=%s, time=%s\n",date,time );
				
		
	}
}
