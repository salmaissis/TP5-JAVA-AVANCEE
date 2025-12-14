package exercice_1;


public class TwoThread extends Thread {
	//prints new Thread 10 times
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("New thread - " + i);
		}
	}
	
	public static void main(String[] args) {
		TwoThread tt = new TwoThread();
		tt.start();
		
		for (int i = 0; i < 10; i++) {
            System.out.println("Main thread - " + i);
        }
		
		test();
	}
	
	
	public static void test() {
		TwoThread tt = new TwoThread();
	    tt.setName("Worker");
	    Thread.currentThread().setName("Test");

	    tt.start();

	    for (int i = 0; i < 10; i++) {
	        System.out.println(Thread.currentThread().getName() + " thread");
	    }
	}
}