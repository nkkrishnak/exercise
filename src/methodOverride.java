
class p
{
    public  int var = 9;
    public void m1()
    {
        System.out.println("p");
    }
}

class c extends p 
{
    public int var = 10;
     public void m1()
    {
        System.out.println("c");
    }
}

class methodOverride{
    
public static void main(String args[])
    {
        p c1 = new c();
        c1.m1();
        System.out.println(c1.var);
    }    
}