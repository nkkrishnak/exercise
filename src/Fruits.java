import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Fruits implements Comparable<Fruits> {
	String name ;

	public static void main (String[] args)
	{
		Fruits f1 = new Fruits();
		f1.name = "abc";
		Fruits f2 = new Fruits();
		f2.name = "ab";
		Fruits f3 = new Fruits();
		f3.name = "abcd";
		Fruits f4 = new Fruits();
		f4.name = "z";
		ArrayList<Fruits> al = new ArrayList<Fruits>();
		al.add(f1);
		al.add(f2);
		al.add(f3);
		al.add(f4);
		Collections.sort(al);
		Iterator<Fruits> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().name);
		}
	}

	@Override
	public int compareTo(Fruits o) {
		// TODO Auto-generated method stub
		return this.name.length()-o.name.length();
	}
}
