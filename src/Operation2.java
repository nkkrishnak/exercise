import  exercise.src.Node;
class Operation2{  
 int data=50;  
  
 void change(Operation2 op){  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
     
  Node root = new Node(15);
      
  void nodeChange(Node n)
  { 
	  Node n1 = new Node();
      n1.value= new Integer ( n.value) ;
	 // n1.left = new Node (n.left.value);
	  //n1.right = new Node (n.right.value);
	  n.value= 3;
	  System.out.println("N1 value"+ n1.value);
	 
  }
 public static void main(String args[]){  
   Operation2 op=new Operation2();  
  
   System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
   
   
   //
   
   System.out.println(op.root.value);
   op.nodeChange(op.root);
   System.out.println(op.root.value);
   
 }  
}  

