package ex05method;

import java.util.Scanner;

public class QuTemperature {
	/*
	 * 문제3) 파일명 : QuTemperature.java 섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는
	 * 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라. 공식은 아래와 같습니다
	 * 
	 * 
	 * 메소드명 : celsiusToFahrenheit() , fahrenheitToCelsius() 공식] 화씨 = 1.8 * 섭씨 + 32
	 * 섭씨 = (화씨 - 32) / 1.8
	 * 
	 */

	public static double celsiusToFahrenheit(double celsius) {
		return 1.8 * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.833;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("섭씨를 입력하세요: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = celsiusToFahrenheit(celsius);
		System.out.printf("섭씨 %.2f도는 화씨 %.2f도입니다.\n", celsius, fahrenheit);

		System.out.print("화씨를 입력하세요: ");
		double fahrenheitInput = scanner.nextDouble();
		double celsiusConverted = fahrenheitToCelsius(fahrenheitInput);
		System.out.printf("화씨 %.2f도는 섭씨 %.2f도입니다.\n", fahrenheitInput, celsiusConverted);

		scanner.close();
		
	}
}
