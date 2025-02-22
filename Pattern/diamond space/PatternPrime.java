import java.util.Scanner;
public class PatternPrime{
	public static int a=1;
	static int prime(){
		boolean pr=false;
		while(!pr){
			pr=true;
			++a;
			if(a==2){
				pr=true;
			}
			else{
				for(int i=2;i<a;i++){
					if(a%i==0){
						pr=false;
						break;
					}
				}
			}
		}
		return a;
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
					System.out.print(prime()+" ");
			}
		System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<2*n;j++){
				if(j>i && j<m-i )
					System.out.print("  ");
				else
					System.out.print(prime()+" ");
			}
		System.out.println();
		}
	}
}