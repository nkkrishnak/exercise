
public class StackUser implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ThreadSafeStack.push(10);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ThreadSafeStack.pop());
	}
	
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new StackUser());
		Thread t2 = new Thread(new StackUser());
		t1.start();
		ThreadSafeStack.push(20);
		System.out.println("Pull in  main ::::"+ ThreadSafeStack.pop());


	}

}
