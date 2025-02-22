import java.util.Scanner;
class A{
    Scanner sc=new Scanner(System.in);
    private int a,b;
    public int get_a(){
        a=sc.nextInt();
        return a;
    }
    public int get_b(){
        b=sc.nextInt();
        return b;
    }
}
class B extends A{
    int c;
    public void display(){
        c=get_a()+get_b();
        System.out.println(c);
    }
}
public class Inheritance
{
	public static void main(String[] args) {
		B o=new B();
		o.display();
	}
}