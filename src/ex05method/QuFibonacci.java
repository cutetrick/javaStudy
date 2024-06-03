package ex05method;


public class QuFibonacci {
	
	    public static void fibonacciProgression(int n) {
	        int first = 0, second = 1;
	        for (int i = 1; i <= n-2; 
	        		i++) {
	            int next = first + second;
	          //System.out.printf("%d번째 항 :%d + %d = %d\n", i, first, second, next);
	            System.out.printf("," + next);
	            first = second;
	            second = next;
	    
	        }
	    }
	    public static void main(String[] args) {
	        int n = 10; // 출력할 항의 개수
	        System.out.println("숫자를 입력하세요: " +  n);
	        fibonacciProgression(n);
	    }
	}




