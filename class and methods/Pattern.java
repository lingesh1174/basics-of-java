import java.util.Scanner;
class LeftangleTriangle{
    void display(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        
    }
}
class RightangleTriangle{
    void display(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        
    }
}

public class Pattern
{
	public static void main(String[] args) {
	    LeftangleTriangle o1=new LeftangleTriangle();
		RightangleTriangle o2=new RightangleTriangle();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		o1.display(n);
		o2.display(n);
	}
} 