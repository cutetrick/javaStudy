package ex04controlstatement;

public class QuPyramid02 {
	public static void main(String[] args) {
		//문제3) 다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.
		/*
		 
		 * * * * *
		 * * * *
		 * * *
		 * *
		 *

		 */
		
		int y=5;
		
		do {
			int j = y;
			do {
				 System.out.print("* ");
				 j--;
			}while (j>0);
			  System.out.println();
	          y--;
		}while(y > 0);
	}

}

