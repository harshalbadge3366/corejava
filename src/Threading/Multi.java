package Threading;

public class Multi  extends Thread{
	public void run()
	{
		try {
			System.out.println("thread"+Thread.currentThread().getContextClassLoader()+"is running");
			
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	
	
	
}
5o 