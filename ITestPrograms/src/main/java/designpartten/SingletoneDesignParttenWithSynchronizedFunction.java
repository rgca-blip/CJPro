package designpartten;

class SingletoneClass {
	private static SingletoneClass object;

	private SingletoneClass() {

	}

	public static synchronized SingletoneClass function() {
		if (object == null) {
			object = new SingletoneClass();
		}
		return object;

	}
}

public class SingletoneDesignParttenWithSynchronizedFunction {

	public static void main(String[] args) {
		SingletoneClass sc = SingletoneClass.function();
		SingletoneClass sc1 = SingletoneClass.function();
		System.out.println("sc==sc1 : " + (sc == sc1));
		System.out.println("sc==sc1 : " + (sc.hashCode() == sc1.hashCode()));
	}

}
