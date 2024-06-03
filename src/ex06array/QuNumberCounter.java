package ex06array;

public class QuNumberCounter {

	/*
	 * 문제1) 파일명 : QuNumberCounter.java 다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다.
	 * 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.
	 * 
	 * int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 }; int[] counter = new int[4];
	 * 
	 * counter[0] => 3 counter[1] => 2 counter[2] => 2 counter[3] => 4
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		countNumbers(answer, counter);

		for (int i = 0; i < counter.length; i++) {
			System.out.println("counter[" + i + "] => " + counter[i]);
		}
	}

	public static void countNumbers(int[] answer, int[] counter) {
		for (int num : answer) {
			counter[num - 1]++;
		}
	}
}