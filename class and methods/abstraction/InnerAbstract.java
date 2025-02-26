abstract class A{
    abstract class B{
        abstract void c();
        static final void d(){
            System.out.println("Hello!");
        } 
    }
    public void c(){
        System.out.println("Welcome!");
    }
    abstract void e();     
}
public class InnerAbstract extends A
{
    public void e(){
    	System.out.println("Hello World");    
    }
	public static void main(String[] args) {
	    InnerAbstract o=new InnerAbstract();
	    o.c();
	    B.d();
	    o.e();
	}
}