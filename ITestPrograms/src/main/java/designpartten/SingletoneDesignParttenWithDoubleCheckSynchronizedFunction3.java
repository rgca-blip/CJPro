package designpartten;

class SingletoneDoubleCheck {
	private static SingletoneDoubleCheck instance;

	private SingletoneDoubleCheck() {

	}

	public static SingletoneDoubleCheck getFiunction() {
		if (instance == null) {
			synchronized (SingletoneDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletoneDoubleCheck();
				}
			}

		}
		return instance;
	}

	class MyThread implements Runnable {

		@Override
		public void run() {
			SingletoneDoubleCheck sdc = SingletoneDoubleCheck.getFiunction();
			System.out.println(sdc.hashCode() + "\t" + Thread.currentThread().getName());
		}

	}
}

public class SingletoneDesignParttenWithDoubleCheckSynchronizedFunction3 {
	public static void main(String[] args) {
		Thread t = new Thread();
		Thread t1 = new Thread();
		for (int i = 0; i < 10; i++) {
			System.out.println(t.hashCode() + "\t" + Thread.currentThread().getName());
			System.out.println("t==t1 : " + (t == t1));
		}

	}
}
