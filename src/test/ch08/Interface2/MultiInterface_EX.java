package test.ch08.Interface2;

public class MultiInterface_EX {

	public static void main(String[] args) {
		//부모 클래스인 SmartTelevision를 RemoterControl2에 넣어줬다
		RemoterControl2 rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		//부모 클래스인 SmartTelevision를 Searchable에 넣어줬다
		Searchable searchable = new SmartTelevision();
		searchable.search("자바");
	}

}
