package Customer;

import java.util.ArrayList;

public class CustomerApplication {
	// Customer 객체(고객)를 저장할 ArrayList를 생성한다
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	// ArrayList에 정보를 넣으려면 .add를 쓰면 된다

	public static void main(String[] args) {
		// 객체 생성하여 고객 만들기

		// 일반 고객(Silver)
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");

		// 골드 고객
		// 골드 고객은 자동형변환을 통해서 쓴다
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "율곡");

		// VIP 고객
		// VIP 고객은 자동형변환을 통해서 쓴다
		Customer customerKIm = new VIPCustomer(10050, "김자바", 12345);

		// ArrayList 명.add(넣고싶은 객체) = ArrayList에 객체를 넣어주는 것
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKIm);

		// static이기 때문에 객체없이 바로 실행가능하다
		CustomerApplication.showAllCustomer();
		// or
		// showAllCustomer();로도 출력가능

		// id로 찾은 고객의 실제 지불금액, 보너스 포인트 출력

		// id로 고객찾기
		// Customer 타입에 customer는 고객찾는 값에 10050을 넣으면 10050의 고객정보를 출력한다
		Customer customer = findCustomer(10050);

		// 모든 고객정보 출력
		// 고객 정보가 customer에서 받아서 일치해야 하지만
		// 일치하지 않으면 null을 출력한다
		// 만약 null이면 존재하지 않는 아이디라고 출력
		if (customer == null) {
			System.out.println("존재하지 않는 회원입니다.");
		} else {
			// 고객의 실제 지불금액 보너스 포인트
			showPriceBonus(customer, 10000);
		}
	}

	// 모든 고객정보 출력
	public static void showAllCustomer() {
		System.out.println("=========모든 고객 정보 출력=========");
		// 향상된 for문은 customerList에 Customer 데이터 타입의 customer를 넣어주는 것이다
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}

	// id로 고객객체를 찾아주는 메소드
	// 여기서 Customer는 리턴받는 데이터 타입이 Customer
	public static Customer findCustomer(int CustomerID) {
		Customer ResultCustomer = null;
		
		for (Customer customer : customerList) {
			// 해당 객체의 customerID와 매개변수로 받아온 customerID가 같으면
			if (customer.getCustomerID() == CustomerID) {
				ResultCustomer = customer;
				break;
			}
		}
		// 해당 객체를 찾지 못하면 null을 출력한다
		return ResultCustomer;
	}

	// price: 물건 살 때 지불한 금액
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("=========해당 고객의 할인율과 보너스 포인트 계산============");

		// customer의 calcePirce(메소드(메소드 값은 지불한 금액이다))에 할인율이 적용된 값이 나온다
		int cost = customer.calcPrice(price);
		System.out.println(customer.getCustomerName() + "님의 지불금액:   " + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트 :  " + customer.bonusPoint);

	}
}
