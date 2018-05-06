package exercise.src;
import java.util.ArrayList;

public class GNode {

	 public int value;
	 public ArrayList<GNode> connect = new ArrayList<GNode>();
	 
	 public GNode(int val)
	 {
		 this.value = val;
	 }
}
