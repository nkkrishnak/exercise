
public class ThreadTest1 implements Runnable {
	
	public void method1()
	{
		synchronized (String.class) {
			System.out.println("Obtained lock on string class");
		}
		
		synchronized (Integer.class){
			System.out.println("Obtained lock on integer class");
		}
	}
	
	public void method2()
	{
		synchronized (Integer.class) {
			
			synchronized(String.class){}
			for (long i = 1 ; i <= 999999999;i++)
			{
				
			}
			
			System.out.println("Obtained lock on integer 2 class");
		}
		
		synchronized (String.class){
			System.out.println("Obtained lock on String 2 class");
		}
	}
	
	public static void main (String [] args) throws InterruptedException
	{
		ThreadTest1  t1 = new ThreadTest1();
		
		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t1);
		
		tr1.start();
		t1.method2();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1 st");
		
		method1();

		System.out.println("2 nd");
	}

}
