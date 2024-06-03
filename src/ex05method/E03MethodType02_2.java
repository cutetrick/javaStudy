package ex05method;

import java.util.Scanner;

public class E03MethodType02_2 {

	//반환타입이 String이므로 문자열의 결과를 반환한다.
	static String getHakjum() {
		//사용자로부터 입력을 받기위해 인스턴스를 생성한다.
		Scanner scanner = new Scanner(System.in);
		//과목의 점수는 정수형으로 입력받는다.
		System.out.println("국어점수:");
		int kor = scanner.nextInt();
		System.out.println("영어점수:");
		int eng = scanner.nextInt();
		System.out.println("수학점수:");
		int math = scanner.nextInt();
		//평균값을 구한다. 
		double avg = (kor + eng + math)/3.0;
		String hakjum = "";
		int result = (int)avg /10;
		//평균값을 통해 학점을 판단한다.
		switch(result) {	
			case 10 :   case 9:
				System.out.println("A학점입니다.");
				break;
			case 8:
				System.out.println("B학점입니다.");
				break;
			case 7:
				System.out.println("C학점입니다.");
				break;
			case 6:
				System.out.println("D학점입니다.");
				break;
			default:
				System.out.println("F학점입니다.");
		}
		return hakjum;
	}
		public static void main(String[] args) {
			System.out.println("너의 학점은" +getHakjum() + " 이다.");
			String h = getHakjum();
			System.out.printf("당신의 학점은 %s입니다.", h);
		
	}

}
