package test.ch08.Interface2;

//다중 상속을 받는것
public class SmartTelevision implements RemoterControl2, Searchable{

	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");				
	}

}
