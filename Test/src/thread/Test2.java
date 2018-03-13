package thread;

public class Test2 implements Runnable{

	public static void main(String[] args) {
		Test2 r = new Test2();
		Thread childThread = new Thread(r);
		childThread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Main Thread");
		}
	}

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Child Thread");
		}		
	}

}
