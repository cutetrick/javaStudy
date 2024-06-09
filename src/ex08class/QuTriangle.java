package ex08class;

public class QuTriangle {

    private double bottom;
    private double height;
    
    public void init(double bottom, double height) {
    	this.bottom = bottom;
    	this.height = height;
    }
    public void setBottom(double bottom) {
     	this.bottom = bottom;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return (bottom * height) / 2.0;
    }
    
	public static void main(String[] args) {
		QuTriangle t = new QuTriangle();
		t.init(10, 17); 
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);
		t.setHeight(14);
		System.out.println("삼각형의 넓이 : "+ t.getArea());

	}

}
