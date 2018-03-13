package thread;

public class Test1 extends Thread {

	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		Test1 childThread = new Test1();
		childThread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Main Thread");
		}

	}

}
