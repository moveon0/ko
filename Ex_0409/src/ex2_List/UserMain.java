package ex2_List;
//유저의 아이디와 패스워드를 가지는 UserInfo클래스를 만들고
//UserMain에서 유저의 정보를 ArrayList에 추가하되
//기존에 추가된 아이디가 있을 경우 "아이디가 중복됩니다"라는 메시지와 함께 다시 입력받기
//예시
//아이디 입력 :aaa
//패스워드 입력 : 1234
//aaa
//1234
//-------
//아이디 입력 : bbb
//패스워드 입력 :1234
//aaa
//1234
//----
//bbb
//1234

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class UserMain {
	public static void main(String[] args) {
		//List<String> arrid = new ArrayList<>();
		//List<Integer> arrpw = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		 /*outer:while(true) {
			 
				System.out.print("아이디 입력 : ");
				String a = sc.next();
				if(arrid.contains(a)) {
					System.out.println("아이디가 중복됩니다.");
					 continue outer;
				} else {
					arrid.add(a);
				}
				System.out.println("비밀번호 입력 : ");
				int b = sc.nextInt();
				arrpw.add(b);
				
				for(int j = 0; j<arrid.size();j++) {
				System.out.println(arrid.get(j));
				System.out.println(arrpw.get(j));
				System.out.println("-----");
				}
				if (arrid.size()==4) {
					break;
			}
		}*/
		 //강사님풀이
		 
		
		 List<userInfo> list = new ArrayList<>();
		 
		 outer :while(true) {
			 userInfo ui = new userInfo();
			 System.out.println("아이디 생성 : ");
			 ui.setId(sc.next());
			 
			 for(int i = 0 ; i < list.size(); i++) {
				 if(ui.getId().equals(list.get(i).getId())) {
					 System.out.println("아이디가 중복됩니다.");
					 continue outer;
				 }
					 System.out.print("패스워드 입력 : ");
					 ui.setPwd(sc.nextInt());
					 
					 list.add(ui);
					 
					 for(userInfo j : list) {
						 System.out.println(j.getId());
						 System.out.println(j.getPwd());
						 System.out.println("--------");
					 }
				 }
			 }
		 }
	}

