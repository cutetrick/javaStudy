package ex05method;

public class QuCircleCalculator {

	/*
	 문제2) 파일명 : QuCircleCalculator.java
	원의 반지름을 인수(파라메타)로 전달하면 원의 넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자.
	이를 호출하는 main 메소드를 정의하시오.
	
	메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
	-넓이공식 : 3.14 * 반지름 * 반지름
	-둘레공식 : 2 * 3.14 * 반지름
	
	원의 둘레(5.5) : 34.54
	원의 넓이(5.5) : 94.985

*/
public static double circleArea(double radius) {
   return 3.14 * radius * radius;
}
public static double circleRound(double radius) {
   return 2 * 3.14 * radius;
}

public static void main(String[] args) {
	double radius = 5.5; 
	  double area = circleArea(radius);
       double circumference = circleRound(radius);
       System.out.printf("원의 둘레(%.1f) : %.2f\n", radius, circumference);
       System.out.printf("원의 넓이(%.1f) : %.3f\n", radius, area);
}

}



