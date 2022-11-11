package test.ch03;

public class Operater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int x = -100;
//			x = -x;
//			System.out.println(x);

		int x = 10;
		int y = 10;
		int z;

		x++; // 후위 연산자는 x가 먼저 대입하고 값이 나중에 증가한다
		++x; // 전위 연산자는 값이 먼저 증가하고 x가 대입된다
		System.out.println("x=  " + x);

		System.out.println("----------");

		y--;
		--y;

		System.out.println("y=  " + y);
		System.out.println("----------");

		z = x++;
		System.out.println("z=  " + z);
		System.out.println("x=  " + x);
		System.out.println("----------");

		z = ++x;
		System.out.println("z=  " + z);
		System.out.println("x=  " + x);
		System.out.println("----------");

		z = ++x + y++;
		System.out.println("z=  " + z);
		System.out.println("x=  " + x);
		System.out.println("y=  " + y);

	}

}
