package Assisted_Practice_project;

public class Thread_Class extends Thread {

	public static void main(String[] args) {
		Thread_Class tc = new Thread_Class();
		tc.start();
	}
	@Override
	public void run() {
		System.out.println("Thread class Creation ");
	}

}
