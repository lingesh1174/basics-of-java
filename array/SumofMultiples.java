import java.util.*;
public class SumofMultiples
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int sum=0;
	    while(b>0){
	        sum+=a;
	        a=a*10+(a%10);
	        b--;
	    }
		System.out.println(sum);
		
	}
}
