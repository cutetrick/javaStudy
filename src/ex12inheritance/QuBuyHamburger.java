package ex12inheritance;
class Burger {
    private String burgerName;
    private int price;
    private String patty;
    private String sauce;
    private String vegetable;

    public Burger(String burgerName, int price, String patty, String sauce, String vegetable) {
        this.burgerName = burgerName;
        this.price = price;
        this.patty = patty;
        this.sauce = sauce;
        this.vegetable = vegetable;
    }

    public int getPrice() {
        return price;
    }

    public void showBurgerInfo() {
        System.out.println(burgerName);
        System.out.println("가격: " + price);
        System.out.println("식재료: " + patty + ", " + sauce + ", " + vegetable);
    }
}

class HamburgerPrice {
    protected Burger burger; 
    final int COKE = 1000;
    final int POTATO = 1500;

    public HamburgerPrice(Burger burger) {
        this.burger = burger;
    }

    public void calculateBasicPrice() {
        int totalPrice = burger.getPrice() + COKE + POTATO;
        System.out.println("결제금액: " + totalPrice);
    }

    public void showPrice() {
        burger.showBurgerInfo();
        calculateBasicPrice();
        System.out.println("================================");
    }
}
class SetPrice extends HamburgerPrice {
    public SetPrice(Burger burger) {
        super(burger);
    }

    @Override
    public void calculateBasicPrice() {
        int totalPrice = super.burger.getPrice() + COKE + POTATO - 500; // 세트 할인
        System.out.println("세트결제금액: " + totalPrice);
    }

    @Override
    public void showPrice() {
        super.burger.showBurgerInfo();
        calculateBasicPrice();
        System.out.println("================================");
    }
}

public class QuBuyHamburger {
    public static void main(String[] args) {
        Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
        Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");

        HamburgerPrice price1 = new HamburgerPrice(burger1);
        price1.showPrice(); 

        HamburgerPrice price2 = new SetPrice(burger2);
        price2.showPrice(); 
    }
}