package TT;
//---------------------------------------------15번문제-------------------------------------------------
public class MemberService {
	String id;
	String pass;

	public boolean login(String id, String pass) {

		if (id.equals("hong") && pass.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 하셨습니다");
	}

	public static void main(String[] args) {

		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");

		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
