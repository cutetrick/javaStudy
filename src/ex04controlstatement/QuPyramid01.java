package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {

		//문제2) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
		/*
		
		*
		* *
		* * *
		* * * *
		* * * * *
		
		*/
		int x=1;
		int y=1;
		
		while(x<=5) {
			while(y<=x) { 
				System.out.print("* ");
				y++;
				}
			System.out.println();
			y=1;
			x++;
		}
	}
}
