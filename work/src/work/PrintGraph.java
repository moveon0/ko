package work;
//2차원 리스트 만들고 [~의개수][해당 숫자]
//반복문으로 배열을 받고 2차원 리스트에 저장
//count로 숫자 개수 세기df
//배열의 크기만큼 .length 로 '#'출력
public class PrintGraph {
	public void PrintGraph(int [] arr) {
		int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		int [] c= {c0,c1,c2,c3,c4,c5,c6,c7,c8,c9};
		int [][] ar= new int [10][30];
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

