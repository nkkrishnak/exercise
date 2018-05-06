import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueuesManip implements Comparable<PriorityQueuesManip>{
	
    public  String str ;
    public  Integer intg;
	
	private PriorityQueue<String> pq = new PriorityQueue<String>();
	private PriorityQueue<PriorityQueuesManip> custompq  = new PriorityQueue<PriorityQueuesManip>();
	
	 public void addToStringQueue(String input)
	 {
		 pq.add(input);
	 }
	 public String pollFromStringQueue()
	 {
		 return (pq.poll());
	 }
	
	 public void addToCustomQueue(ArrayList<PriorityQueuesManip> input)
	 { 
         Iterator<PriorityQueuesManip> inpIter = input.iterator();
         while(inpIter.hasNext())
         {
        	 custompq.add(inpIter.next());
         }
	 }
	 public PriorityQueuesManip pollFromCustomQueue()
	 {
		 return (custompq.poll());
	 }
	
	public static void main(String[] args)
	{
		PriorityQueuesManip obj = new PriorityQueuesManip();
		obj.addToStringQueue("hehe");
		obj.addToStringQueue("amma");
		obj.addToStringQueue("aaa");
		obj.addToStringQueue("deer");
		System.out.println(obj.pollFromStringQueue());
		
		//Custom block 
		PriorityQueuesManip obj1 = new PriorityQueuesManip();
		obj1.str="amma";
		obj1.intg = 3;
		PriorityQueuesManip obj2 = new PriorityQueuesManip();
		obj2.str="zombie";
		obj2.intg = 21;
		PriorityQueuesManip obj3 = new PriorityQueuesManip();
		obj3.str="baba";
		obj3.intg = 1;
		ArrayList<PriorityQueuesManip> al = new ArrayList<PriorityQueuesManip>();
	    al.add(obj1);
	    al.add(obj2);
	    al.add(obj3);
	    obj.addToCustomQueue(al);
	    System.out.println(obj.pollFromCustomQueue().intg);
	    System.out.println(obj.pollFromCustomQueue().intg);
	    System.out.println(obj.pollFromCustomQueue().intg);

	}
	@Override
	public int compareTo(PriorityQueuesManip arg0) {
		// TODO Auto-generated method stub
		return this.intg - arg0.intg; 
	} 
	
}
