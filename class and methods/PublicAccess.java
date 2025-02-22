import java.util.Scanner;
public class PublicAccess
{
    public int x,y,z;
    public void display(){
        System.out.println(z);
    }
	public static void main(String[] args) {
		PublicAccess m=new PublicAccess();
		Scanner sc=new Scanner(System.in);
		m.x=sc.nextInt();
		m.y=sc.nextInt();
		m.z=m.x+m.y;
		m.display();
	}
}