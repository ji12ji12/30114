
public class FruitSales {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		buyer.buyApple(seller, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}

class FruitSeller {
	int numOfApple = 20;
	int myMoney = 0;
	private int APPLE_PRICE = 1000;
	
	public FruitSeller(){}
	
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMoney = APPLE_PRICE*num;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("과일 판매자 현재 상황");
		System.out.println("남은 과일 개수 : "+numOfApple);
		System.out.println("수익 : "+myMoney);
	}
	
}

class FruitBuyer {
	int numOfApple = 0;
	int myMoney = 5000;
	
	public FruitBuyer() {}
	
	public void buyApple(FruitSeller fsr, int money) {
		numOfApple = fsr.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("과일 구매자 현재 상황");
		System.out.println("현재 잔액 : "+myMoney);
		System.out.println("사과 개수 : "+numOfApple);
	}
}
