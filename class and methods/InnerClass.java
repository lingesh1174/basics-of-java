class Main2
{
    final static class Inner{
	    static void display(){
	        int a=700;
	        int b=688;
	        System.out.println("sum :"+(a+b));
	    }
    }
}
public class InnerClass{
    public static void main(String[] args) {
		    Main2.Inner.display();
	    }
}