package test.ch12;

public class Generic_EX2 {

	public static void main(String[] args) {
		//Product에 K는 Tv를 M은 String을 넣었다
		Product<Tv, String> pro1 = new Product<>();
		//product의 필드 kind는 Tv객체가 되고
		//product의 필드 model은 "Smart Tv"가 된다
		pro1.setKind(new Tv());
		pro1.setModel("Smart Tv");
		
		Tv t = pro1.getKind();
		String tModel = pro1.getModel();
		
		Product<Car, String> pro2 = new Product<>();
		pro2.setKind(new Car());
		pro2.setModel("Electric Car");
		
		Car c = pro2.getKind();
		String cModel = pro2.getModel();
		
		
	}

}
