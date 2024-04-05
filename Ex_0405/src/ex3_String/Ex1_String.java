package ex3_String;

import java.util.Arrays;

//String클래스
//문자열을 처리하는 객체형 데이터 타입
//일반적으로 문자열 데이터를 담는 간단한 형식으로 사용하지만
//문자열을 처리하기 위한 다양한 기능들을 가지고 있다.
//String객체는 한 번 생성되면 그 값을 읽기만 하고 변경할 수 없다.
public class Ex1_String {
	public static void main(String[] args) {
		String str = "Kim mal Ddong";
		
		//length : 문자열의 길이
		System.out.println("문자열 str의 길이 : " + str.length());
		
		//indexOf : 특정 문자의 인덱스 찾기
		System.out.println("문자 a의 위치 : "+str.indexOf('a'));
		
		//lastIndexOf : 오른쪽에서 왼쪽으로 글자 탐색
		
		//charAt : 해당 위치의 글자를 반환
		System.out.println("5번 index의 값 : "+ str.charAt(5));
		
		//subString : 내가 원하는 만큼 문자열 잘라냄
		System.out.println("0번부터 4번까지 잘라내기 : "+ str.substring(0,5));
		
		//split : 특정 문자를 기준으로 문자열을 잘라서 배열에 저장
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String str2 = "홍길동/20살/인천시 부평구";
		System.out.println(Arrays.toString(str2.split("/")));
	}
}
