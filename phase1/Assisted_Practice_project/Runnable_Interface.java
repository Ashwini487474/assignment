package Assisted_Practice_project;

public class Runnable_Interface implements Runnable {
	public static int count =0;
	public Runnable_Interface() {
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(Runnable_Interface.count <=10) {
			try {
				System.out.println("EXP Thread : "+(++Runnable_Interface.count));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in Thread : "+iex.getMessage());
			}
		}
		
	}

	public static void main(String[] args) {
		Runnable_Interface ri = new Runnable_Interface();
		Thread t = new Thread(ri);
		t.start();
		while(Runnable_Interface.count <= 10) {
			try {
				System.out.println("Main Thread :"+(++Runnable_Interface.count));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Execption in main Thread :"+iex.getMessage());
			}
		}

	}

}
