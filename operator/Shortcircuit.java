public class Shortcircuit
{
	public static void main(String[] args) {
		int a=101, b=75, c=98;
		if(a>b && a>c)
		    System.out.println(a);
		else if(b>a && b>c)
		    System.out.println(b);
		else
		    System.out.println(c);
	}
} 