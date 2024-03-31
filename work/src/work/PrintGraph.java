package work;
// 숫자 개수 세는 c*들을 c 리스트로 만든다.
// 랜덤 정수가 들어올 때마다 해당 c를 +1한다.
//0~9니깐 10으로 반복문 돌린다.
//i가 0~9가 되면서 c[0]~c[9]의 정수 개수만큼 '#'을 출력한다sss
//해당 정수의 개수는 c[*]의 길이로 표현한다.
//끝!
public class PrintGraph {
	public void PrintGraph(int [] arr) {
		int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		int [] c= {c0,c1,c2,c3,c4,c5,c6,c7,c8,c9};
		
		for (int i = 0 ; i < arr.length; i++) {
			switch(arr[i]) {
				case 0:
					c[0]++;
					continue;
				case 1:
					c[1]+=1;
					continue;
				case 2:
					c[2]+=1;
					continue;
				case 3:
					c[3]+=1;
					continue;
				case 4:
					c[4]+=1;
					continue;
				case 5:
					c[5]+=1;
					continue;
				case 6:
					c[6]+=1;
					continue;
				case 7:
					c[7]+=1;
					continue;
				case 8:
					c[8]+=1;
					continue;
				case 9:
					c[9]+=1;
					continue;
				}
			}
		
		for (int i =0; i < 10; i++) {
			System.out.printf("%d의 갯수 : ",i);
			int a = 0;
			for(int j = 0; j < c[a]; j++) {
				System.out.print("#");
			}
			System.out.println(c[i]+"\n");
			a++;
			
		}
	}	
}

