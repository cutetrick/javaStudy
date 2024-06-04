package ex08class;

/*
 두번째 예제에서는 멤버변수의 초기값을 모두 제거하고, 초기화를 위한 멤버메서드를
 추가한다. 초기값이 미리 지정되어 있는것은 인스턴스 생성시 확장성이 떨어진다.
 */
class FruitSeller2 {

	int numOfApple;
	int MyMoney;
	// 기존 멤버상수로 선언했던 부분을 일반멤버변수로 변경한다.
	int apple_price;
	/*
	 사과의 단가를 표현하는 멤버변수가 상수로 선언되면 선언과 동시에 초기화해야한다.
	 즉, 초기값이 없는 상태로는 선언 자체가 불가능하다. 따라서 두번쨰 예제에서는
	 기존의 상수를 일반 변수로 변경해야한다.
	 */
	
	/*
	 초기화 메서드를 선언하여 인스턴스 생성 후 다양한 형태의 초기화가 가능하다.
	 */
	public void initMembers(int money, int appleNum, int price) {
		MyMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}


	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		MyMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과개수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + MyMoney);
	}
}


class FruitBuyer2 {
	
	//멤버변수의 초기값이 없는 상태로 선언
	int myMoney;
	int numOfApple;
	
	//멤버변수 초기화를 위한 멤버베서드 추가
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	//사과구매
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showSaleResult() {
		System.out.println("[판매자]현재잔액:" + myMoney);
		System.out.println("[판매자]사과갯수:" + numOfApple);
	}
}

public class E06FruitSalesMain2 {
	
	
	public static void main(String[] args) {
		/*
		 클래스를 초기값이 없는 상태로 변경하고 초기화 메서드를 생성하였으므로
		 상태가 다른 인스턴스를 생성할 수 있다.
		 */
		//판매자1: 사과100개 보유, 단가 1,000원
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		//판매자2 : 사과 80개 보유, 단가 500원
		FruitBuyer2 seller2 = new FruitBuyer2();
		seller2.initMembers(0, 80 ,500);
		//구매자 : 보유금액 10,000원
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showSaleResult();
		// 각각의 판매자에게 5000원씩 지불하고 사과를 구매한다.
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();//5개
		seller2.showSaleResult();//10개판매
		//10,000원을 지불하고 15개의 사과를 구매한다.
		buyer.showSaleResult(); 
	}

}
