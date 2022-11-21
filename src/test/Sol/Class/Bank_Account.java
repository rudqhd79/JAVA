package test.Sol.Class;

public class Bank_Account {
	// 필드
	private String ACC; // 계좌번호
	private String name; // 계좌주
	private int deposit; // 초기입금액

	// 생성자
	public Bank_Account(String ACC, String name, int deposit) {
		this.ACC = ACC;
		this.name = name;
		this.deposit = deposit;
	}

	// 메소드 -> private이기 때문에 (source에서 getters setters 선택해서 작성)
	public String getACC() {
		return ACC;
	}

	public void setACC(String ACC) {
		this.ACC = ACC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
}
