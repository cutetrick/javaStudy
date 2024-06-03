package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {
		//문제4) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.

		/*
		        *
		      * * *
		    * * * * *
		  * * * * * * *
		* * * * * * * * *

		 */
		
	   int  n = 5;
	   	for(int i=1; i<=n; i++) {
	   		for(
	   				int j=0;j<n-i;j++) {
		        System.out.print(" ");
		         }
		          for(int j=0; j<2*i-1;j++) {
		              System.out.print("*");
		          }
		           System.out.println();
		        }
		    }
		}

