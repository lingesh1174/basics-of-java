public class Counter
{
    static int count=0;
    Counter(){
        System.out.println("Object created! current count = "+ ++count);
    }
	public static void main(String[] args) {
		Counter a=new Counter();
		Counter b=new Counter();
		Counter c=new Counter();
	}
}