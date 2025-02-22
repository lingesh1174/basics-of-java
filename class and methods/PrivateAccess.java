import java.util.Scanner;
class A
{
    private int a,b,c;
    private void get(){
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public void display(){
        get();
        c=a+b;
        System.out.println(c);
    }
}
public class PrivateAccess{
    public static void main(String[] args) {
		A o=new A();
		//o.get();
		o.display();
	}
}