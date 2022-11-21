package Customer;

//Customer는 슈퍼클래스 GoldCustomer는 서브클래스
public class GoldCustomer extends Customer {
	//필드
	double saleRatio; //할인율
	
	//생성자
	public GoldCustomer(int customerID, String customerName) {
		//Customer 생성자의 매개변수 customerID, customerName를 가져왔다
		super(customerID, customerName);
		
		//메소드 안에서 override처럼 super를 통해 재정의 했다
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		
		//GOLD등급의 할인율은 0.1
		this.saleRatio = 0.1;
	}

	//메소드
	@Override	//재정의
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		//price가 10000원이면 골드 등급에 따라 할인율이 적용되는 것을 매개변수에 리턴해준다
		return price - (int)(price * saleRatio);
	}
	
	
	
	
}
