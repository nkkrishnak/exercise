
public class ThreadTest 	 implements Runnable,interf{

	public static void main(String [] args)
	{
		ThreadTest t1 = new ThreadTest();
		t1.run();
		ThreadTest t2 = new ThreadTest();
		t2.run();
	}

	@Override
	public void run() {
		try {
			System.out.println("Inside run");
			sleep(100);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public String draw() {
		return null;
	}
	
}
