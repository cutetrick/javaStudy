package ex12inheritance;

class Rectangle {
	protected int width;
	protected int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void showAreaInfo() {
		int area = width * height;
		System.out.println("직사각형 면적: " + area);
	}
}

class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void showAreaInfo() {
		int area = width * width;
		System.out.println("정사각형 면적: " + area);
	}
}

public class QuRectangleMain {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4, 3);
		rec.showAreaInfo();

		Square sqr = new Square(7);
		sqr.showAreaInfo();
	}
}
