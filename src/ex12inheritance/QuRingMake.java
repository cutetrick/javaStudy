package ex12inheritance;

class Point {
    int xDot, yDot;

    public Point(int x, int y) {
        xDot = x;
        yDot = y;
    }

    public void showPointInfo() {
        System.out.println("[x좌표:" + xDot + ", y좌표" + yDot + "]");
    }
}

class Circle {

    int radian; 
    Point center;


    public Circle(int x, int y, int radian) {
        center = new Point(x, y);
        this.radian = radian;
    }


    public void showCircleInfo() {
        System.out.println("반지름: " + radian);
        center.showPointInfo();
    }
}

class Ring {
    Circle innerCircle; 
    Circle outerCircle; 

    public Ring(int x1, int y1, int radian1, int x2, int y2, int radian2) {
        innerCircle = new Circle(x1, y1, radian1);
        outerCircle = new Circle(x2, y2, radian2);
    }
    public void showRingInfo() {
        System.out.println("안쪽원의 정보 :");
        innerCircle.showCircleInfo();
        System.out.println("바깥쪽원의 정보 :");
        outerCircle.showCircleInfo();
    }
}

public class QuRingMake {
    public static void main(String[] args) {
        Ring c = new Ring(1, 1, 3, 2, 2, 9);
        c.showRingInfo();
    }
}