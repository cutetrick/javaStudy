package ex04controlstatement;

public class QuPyramid04 {
	public static void main(String[] args) {
		//문제5) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
		
		/*
		 * 
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		 * * * * 
		 * * *
		 * * 
		 * 

		 */
		
		
		int n= 5;
		
		   for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		   for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
		   }
	}
}