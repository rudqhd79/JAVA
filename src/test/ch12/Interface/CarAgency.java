package test.ch12.Interface;

public class CarAgency implements Rentable <Car> {

	@Override
	public Car rent() {
		return new Car();
	}

}
