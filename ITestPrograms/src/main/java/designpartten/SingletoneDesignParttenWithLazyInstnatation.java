package designpartten;

class LazyInstnatation {
	private static LazyInstnatation object;

	private LazyInstnatation() {

	}

	public static LazyInstnatation getFunction() {
		if (object == null) {
			object = new LazyInstnatation();
		}
		return object;
	}
}

public class SingletoneDesignParttenWithLazyInstnatation {

	public static void main(String[] args) {
		LazyInstnatation l1 = LazyInstnatation.getFunction();
		LazyInstnatation l2 = LazyInstnatation.getFunction();
		System.out.println("l1==l2  : " + (l1.equals(l2)));

	}

}
