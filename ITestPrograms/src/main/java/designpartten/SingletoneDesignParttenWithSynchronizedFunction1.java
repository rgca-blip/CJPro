package designpartten;

class Singletone {
	private static Singletone object;

	private Singletone() {

	}

//synchronized
	public static Singletone function() {
		if (object == null) {
			object = new Singletone();
		}

		return object;
	}
}

class MyThread implements Runnable {

	@Override
	public void run() {
		Singletone si = Singletone.function();
		System.out.println(si.hashCode() + "\t" + Thread.currentThread().getName());

	}

}

public class SingletoneDesignParttenWithSynchronizedFunction1 {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		for (int i = 0; i < 50; i++) {
			Thread t = new Thread(my);
			Thread t1 = new Thread(my);
			t.start();
			t1.start();
		}

	}

}
