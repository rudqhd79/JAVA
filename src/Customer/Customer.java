package Customer;

public class Customer {
	//필드
	//protected는 상속 && 같은 패키지 안에있는 것만 쓸 수 있음
	//protected를 상속받지 않은 곳에서 쓰려면 getters setters를 사용하여 쓸 수 있다
	protected int customerID; //고객아이디
	protected String customerName;		//고객이름
	protected String customerGrade;		//고객등급 : 실버,골드
	int bonusPoint;		//보너스 포인트 적립
	double bonusRatio;	//보너스 포인트 적립 비율
	
	//여기서 protected는 상속되지 않아서 getters setters를 통해 사용한다
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	//생성자
	public Customer() {
		//initCustomer() 메소드 실행
		initCustomer();
	}
	
	//메소드
	//고객 등급 초기화
	public Customer(int customerID, String customerName) {
		//필드의 값이라는 것을 말한다
		this.customerID = customerID;
		this.customerName = customerName;
		
		//initCustomer() 메소드 실행
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//보너스 포인트 계산, 가격 리턴
	public int calcPrice(int price) {		//price: 지불 금액
		//보너스 포인트는 누적합산이 되어야 한다
		bonusPoint += (price * bonusRatio);	//보너스포인트를 적립하는 것
		
		//price를 리턴하는 이유는 일반고객은 할인율이 0이다
		return price;
	}
	
	//고객정보 보여주기
	public String showCustomerInfo() {
		//고객 정보를 넣어주는 메소드 이기 때문에 다 입력 해준다
		return customerName + "님의 등급:   " + customerGrade + ", 보너스 포인트:  "  + bonusPoint + "점";
	}
}
