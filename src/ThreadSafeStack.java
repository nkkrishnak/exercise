import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ThreadSafeStack {

	public static List<Integer> list = Collections.synchronizedList(new LinkedList<Integer>());
	//public static List<Integer> list = new LinkedList<Integer>();
	
	public static  void push(Integer a)
	{
		synchronized(list){
		list.add(a);
		}
	}
	
	public static Integer pop ()
	{
		synchronized (list) {
			if (list.isEmpty())
				return null;
			Iterator<Integer> itr = list.iterator();
			Integer temp=null;
			while(itr.hasNext())
			{
				temp = itr.next();
			}
			list.remove(temp);
			return temp;

		}
		
	}
}
