import java.util.ArrayList;
import java.util.Iterator;

import exercise.src.GNode;

public class GrapthManip {

	
	 public void makeDirectConnect(GNode n, int value)
	 {
		 ArrayList<GNode> al = n.connect;
		 GNode g = new GNode(value);
		 al.add(g);
	 }
	 
	 public boolean checkLink (GNode n, int value )
	 {
		 ArrayList<GNode> al = n.connect;
		 GNode g = null;
		 Iterator<GNode>itr = al.iterator();
		 while (itr.hasNext())
		 {
			 GNode gn = (GNode) itr.next();
			 if (gn.value == value)
				 return true;
			 checkLink(gn,value);
		 }
		 return false;
	 }
	 public static void main (String[] args)
	 {
		 GNode n1 = new GNode(1);
		 GrapthManip obj = new GrapthManip();
		 obj.makeDirectConnect(n1,2);
		 System.out.println(obj.checkLink(n1, 2));
		 Iterator<GNode> itr = n1.connect.iterator();
		 GNode n2 = itr.next();
		 System.out.println(n2.value);
		 GNode n3 = new GNode(3);
         n1.connect.add(n3);
		 //obj.makeDirectConnect(n2,3);
		 System.out.println(obj.checkLink(n1, 3));
		 //
		 System.out.println(n1.connect.toString());
		 Iterator<GNode> itr1= n1.connect.iterator();
		 while ( itr1.hasNext())
		 {
			 GNode g = itr.next();
			 System.out.println(g.value);
		 }
		 

	 }
}
