import java.util.*;
public class Digits{
    
    static boolean evensum(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }
    static boolean oddsum(int n){
        if(n%2!=0)
            return true;
        else
            return false;
    }
    static boolean primesum(int n){
         boolean isprime=false;
         if(n==2)
	            isprime=true;
	    else{
            for(int i=2;i<n;i++){
                isprime=false;
	            if(n%i==0){
	                isprime = false;
	                break;
	            }
	            else
	                isprime= true;
	        }
        }
        if(isprime)
            return true;
        else
            return false;
    }
    void reverse(int n){
        int rem,rev=0;
	    while(n>0){
	        rem=n%10;
	        n=n/10;
	        rev=(rev*10)+rem;
	    }
	    System.out.println(rev);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Main o=new Main();
		int rem, even=0, prime=0, odd=0;
		while(num>0){
		    rem=num%10;
		    if(o.evensum(rem))
		        even=even*10+rem;
		    if(o.oddsum(rem))
		        odd=odd*10+rem;
		    if(o.primesum(rem))
		        prime=prime*10+rem;
		    num/=10;
		    
		}
		System.out.println(even);
		System.out.println(odd);
		System.out.println(prime);
		o.reverse(even);
		o.reverse(odd);
		o.reverse(prime);
		
		
	}
}