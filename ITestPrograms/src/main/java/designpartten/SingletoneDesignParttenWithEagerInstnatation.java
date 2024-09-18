package designpartten;

class SingletoneTest {
	private static SingletoneTest instance = new SingletoneTest();

	private SingletoneTest() {

	}

	public static SingletoneTest getFunction() {
		return instance;
	}
}

public class SingletoneDesignParttenWithEagerInstnatation {

	public static void main(String[] args) {
		SingletoneTest st = SingletoneTest.getFunction();
		SingletoneTest st1 = SingletoneTest.getFunction();
		System.out.println("st==st1 : " + (st == st1));
	}

}
