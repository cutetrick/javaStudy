package ex09package.study.buyer;

import ex09package.study.seller.FruitSeller4;

public class FruitBuyer4 {

	int myMoney;
	int numOfApple;
	

	public FruitBuyer4(int _myMoney, int appleNum) {
		myMoney = _myMoney;
		numOfApple = appleNum;
	}
	
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showSaleResult() {
		System.out.println("[판매자]현재잔액:" + myMoney);
		System.out.println("[판매자]사과갯수:" + numOfApple);
	}
}