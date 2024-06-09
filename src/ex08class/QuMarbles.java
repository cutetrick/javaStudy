package ex08class;

public class QuMarbles {
    private int marbles;


    public QuMarbles(int marbles) {
        this.marbles = marbles;
    }

    public void obtainBead(QuMarbles otherChild, int numMarbles) {
        if (otherChild.marbles >= numMarbles) {
            this.marbles += numMarbles;
            otherChild.marbles -= numMarbles;
        } else {
            System.out.println("Not enough marbles to transfer.");
        }
    }
    public void showProperty() {
        System.out.println("보유 구슬의 개수 " + marbles);
    }
    
	public static void main(String[] args) {
		        	
		QuMarbles child1 = new QuMarbles(20);
		QuMarbles child2 = new QuMarbles(15);

			System.out.println("게임 전 구슬의 보유 개수");
			System.out.print("어린이1 : ");
			child1.showProperty(); 
			System.out.print("어린이2 : ");
			child2.showProperty(); 

	
			child1.obtainBead(child2, 5);
			child2.obtainBead(child1, 9);

			System.out.println("\n게임 후 구슬의 보유 개수");
			System.out.print("어린이1 : ");
			child1.showProperty(); 
			System.out.print("어린이2 : ");
			child2.showProperty();

	}
}
