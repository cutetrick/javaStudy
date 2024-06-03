package ex05method;


public class QuFindPrimeNumber {

public static boolean isPrimeNumber(int num) {
 if(num==1)
	  return true;
 for(int i=2; i<num; i++) {
	  if(num%i==0)
		  return false;
}
 return true;
}
public static void main(String[] args) {
       System.out.println("1부터 100사이의 소수:");
       for (int i = 2; i <= 100; i++) {
           if (isPrimeNumber(i)) {
               System.out.print(i + " ");
           }
       }
   }
}

