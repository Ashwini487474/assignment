package Assisted_Practice_project;


public class Sleep_and_wait {
	private  static Object LOCK = new Object();

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Thread"+Thread.currentThread().getName()+"is woken after sleeping for 2 seconds");
		synchronized (LOCK) {
		 	LOCK.wait(1000);
		 	System.out.println("Object"+LOCK+"is Woken after"+"waiting for 1 second");
		}
		

	}

}
