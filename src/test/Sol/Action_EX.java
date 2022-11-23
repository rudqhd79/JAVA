package test.Sol;

public class Action_EX {

	public class ActionExample {

		public void main(String[] args) {

			Action action = new Action() {
				@Override
				public void work() {
					System.out.println("복사를 합니다.");
				}
			};
			action.work();
		}
	}
}
