package designpartten;

class Singletone2 {
	private static Singletone2 instance;

	private Singletone2() {

	}

	public static Singletone2 getFinction() {
		synchronized (Singletone2.class) {
			if (instance == null) {
				instance = new Singletone2();
			}
		}
		return instance;
	}
}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		Singletone2 s = Singletone2.getFinction();
		System.out.println(s.hashCode() + "\t" + Thread.currentThread().getName());
	}

}

public class SingletoneDesignParttenWithSynchronizedFunction2 {

	public static void main(String[] args) {
		MyThread2 m = new MyThread2();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(m);
			t.start();
		}

	}

}
