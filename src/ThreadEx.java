
public class ThreadEx  implements Runnable{

	public static void main(String[] args)
	{
		System.out.println("T1 creation");
		Thread tx = new Thread(new ThreadEx());
		tx.start();
//		Thread tx1 = new Thread(new ThreadEx());
//		System.out.println(" T2 creation");
//		tx1.start(); 	
		 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Main end");
	} 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Fist line");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("second line");
	}
}
