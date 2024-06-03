package ex05method;

public class QuSymmetry {

	/*
	 * 문제6) 파일명 : QuSymmetry.java 다음과 같은 회전대칭 모양의 출력결과를 보이는 프로그램을 while문과 for문으로
	 * 작성하시오. 단, 메서드로 작성해야 한다.
	 * 
	 * 메서드명 : rotationSymmetry() 0 0 0 1 0 0 1 0 0 1 0 0 1 0 0 0
	 * 
	 */
	public static void rotationSymmetry() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i + j == 3) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rotationSymmetry();
	}
}
