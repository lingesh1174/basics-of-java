import java.util.Scanner;
public class PatternFibbi{
	public static long a1=0,a2=1;
	public static int a=0;
	static long fibbi(int a){
		if(a==0||a==1)
			return a;
		else{
			long temp=a2;
			a2=a1+a2;
			a1=temp;
			return a2;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=2*n;
		for(int i=1;i<n;i++){
			for(int j=1;j<2*n;j++){
				if(j>n-i+1 && j<m-(n-i+1))
					System.out.print("  ");
				else
					System.out.print(fibbi(a)+" ");
				a++;
			}
		System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<2*n;j++){
				if(j>i && j<m-i )
					System.out.print("  ");
				else
					System.out.print(fibbi(a)+" ");
				a++;
			}
		System.out.println();
		}
	}
}