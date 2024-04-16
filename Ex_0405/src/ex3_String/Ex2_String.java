package ex3_String;
import java.util.Scanner;
import java.util.random.*;
public class Ex2_String {
	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하세요
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("알파벳을 입력하세요 : ");
		String word = sc.next();
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)=='a') {
				count+=1;
			} else {
				continue;
			}
		}
		System.out.println("a의 개수는 : "+count);
		
		System.out.println("------------------------");*/
		//키보드에서 문자열을 입력받아 회문인지 아닌지 판별
		//회문은 앞으로 읽어도 뒤로 읽어도 똑같은 문장을 말한다.
		
		/*System.out.println("문자열을 입력하세요: ");
		String word1= sc.nextLine();
		int count1=0;
		for( int i = 0; i<word1.length(); i++) {
			if(word1.indexOf(word1.charAt(i)) != word1.indexOf(word1.charAt((word1.length()-1)-i))) {
				count1++;
			}
		}
		if(count1==0) {
			System.out.println("회문입니다.");
		}else {
			System.out.println("회문이 아닙니다.");
		}
		
		//강사님 풀이
		System.out.println("문자열 입력 :");
		String ori = sc.next();
		
		String rev = "";
		
		for(int i = ori.length()-1; i >=0; i--) {
			rev += ori.charAt(i);
		}
		if(ori.equals( rev)) {
			System.out.println("회문입니다.");
		} else {
			System.out.println("회문이 아닙니다.");
		}
		
		System.out.println("--------------------");
		*/
		//주민번호를 입력하세요(-포함)
				//예) 911223-1122333
				//당신은 1999년 11월 22일에 태어난 남자입니다.
				
				System.out.println("주민번호를 입력하세요 : ");
				String code = sc.next();
				char[] arr = code.toCharArray();
				String year = code.substring(0, 2);
				String month = code.substring(2,4);
				String day = code.substring(4,6);
				String s ;
				if( arr[7] % 2 !=0) {
					s="남자";
				} else {
					s="여자";
				}
				if((int)arr[0]>= 51) {
					System.out.printf("당신은 %s년 %s월 %s일에 태어난 %s입니다.",19+year,month,day,s);
				} else if ((int)arr[0]< 51) {
					System.out.printf("당신은 %s년 %s월 %s일에 태어난 %s입니다.",20+year,month,day,s);
				}
				
				//강사님 풀이
				
				System.out.println("주민번호를 입력하세요 : ");
				String id = sc.next();
				
				if(id.length()<14 || id.charAt(6) !='-') {
					System.out.println("주민번호를 올바르게 입력하세요");
				} else {
					String year1 = "";
					String result = "";
					
					year1 = id.substring(0,2);
					if(Integer.parseInt(year1) <= 14){
						result = "당신은 20";
					} else {
						result = "당신은 19";
					}
					result += year +"년 " +id.substring(2, 4)+"월 "+id.substring(4,6)+"일에 태어난 ";
					
					if(id.charAt(7) % 2 != 0) {
						result += "남자입니다.";
					} else {
						result += "여자입니다.";
					}
					
					System.out.println(result);
				}
				//메모리에 올라간 문자열은
				//값이 수정됐을 때 기존의 메모리를 버리고
				//새로운 값이 들어있는 메모리를 새로 점유
				
				//사용하지 않는 기존 메모리는 GC(Garbage Collecter가 힙영역을 돌아다니면서 수거함
		
	}
	
}
