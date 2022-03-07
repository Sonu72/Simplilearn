package package1;

public class ThreadDemo extends Thread{
	
	public void run()
	{
	 System.out.println("concurrent thread started running..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo thread = new ThreadDemo();
		 thread.start();

	}

}
