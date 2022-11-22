package Customer;

public class VIPCustomer_Other extends Customer {
	// 필드
	// VIP는 중요한 고객이라 private를 준다
	private int agentID; // 상담원 아이디
	double saleRatio; // 할인비율

	// 생성자
	// 객체를 생성할 때 상담원 아이디도 출력해야 되니까 int agentID도 넣어준다
	public VIPCustomer_Other(int customerID, String customerName, int agentID) {
		super(customerID, customerName);

		// 메소드 안에서 override처럼 super를 통해 재정의 했다
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;

		// VIP등급의 할인율은 0.1
		this.saleRatio = 0.2;

		// 필드의 agentID라고 지목;
		this.agentID = agentID;
	}

	// 메소드
	// VIP는 할인율과 보너스 비율이 다르기 때문에 Override 2개를 만들어줘야 한다
	@Override
	public int calcPrice(int price) {
		// 보너스 포인트는 누적합산이 되어야 한다
		bonusPoint += (price * bonusRatio); // 보너스포인트를 적립하는 것
		return price - (int) (price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		// 굳이 입력할 필요없이 showCustomerInof()메소드를 실행시킨다
		return super.showCustomerInfo() + ", 담당 상담원 아이디: " + agentID;
	}

	// 상담원이 VIP 등급에는 따로 나뉘기 때문에 만들어준다
	public int getAgentID() {
		return agentID;
	}
}
