public class Unary
{
	public static void main(String[] args) {
	    int x=10;
	    //int v= --x + x++ + ++x + --x + x++;
	    //int z= x++ + ++x + ++x + x++ + ++x;
	    int a= --x + --x + --x + --x;
		System.out.println(a);
	}
}