package ex06array;

import java.util.Scanner;

public class QuFillArray {
	/*
	 * 문제3) 홀수/짝수 구분하여 배열채우기 파일명 : QuFillArray.java 길이가 10인 배열을 선언한 후 총 10개의 정수를
	 * 입력받아 순서대로 저장한다. (첫번째배열) 그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터
	 * 채워나간다.(두번째배열)
	 * 
	 * 1번째 정수를 입력하세요:2 2번째 정수를 입력하세요:4 3번째 정수를 입력하세요:5 4번째 정수를 입력하세요:3 5번째 정수를
	 * 입력하세요:2 6번째 정수를 입력하세요:9 7번째 정수를 입력하세요:7 8번째 정수를 입력하세요:8 9번째 정수를 입력하세요:5 10번째
	 * 정수를 입력하세요:1 순서대로입력된결과 2 4 5 3 2 9 7 8 5 1 홀수/짝수 구분입력결과 5 3 9 7 5 1 8 2 4 2
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[10];
		int[] array2 = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 정수를 입력하세요: ");
			int num = scanner.nextInt();
			array[i] = num;
		}

		System.out.println("순서대로 입력된 결과");
		printArray(array);

		int frontIndex = 0;
		int rearIndex = array2.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				array2[frontIndex++] = array[i];
			} else {
				array2[rearIndex--] = array[i];
			}
		}

		System.out.println("홀수/짝수 구분 입력 결과");
		printArray(array2);

		scanner.close();
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
