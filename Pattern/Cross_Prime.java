import java.util.Scanner;
interface Prime{
    default int printprime(int n,int i){
        boolean prime=false;
	    while(!prime){
	        ++i;
	        if(i==2)
	            prime=true;
	        else{
	            for(int j=2;j<i;j++){
	                if(i%j==0){
	                    prime = false;
	                    break;
	                }
	                else
	                    prime= true;
	                }
	       }
	    }
	    return i;
    }
}
interface Pattern extends Prime{
    default void pattern(int n){
        int k=1;
        for(int i=1;i<=n;i++){
    	    for(int j=1;j<=n;j++){
    	        if(i==j||j==n-i+1){
    	            if(i<(n/2)+1)
    	                System.out.print(n-j+1+" ");
    	            else
    	                System.out.print(j+" ");
    	        }
    	        else if((i==(n/2)+1 && (j==1 || j==n) )|| (j==(n/2)+1 && (i==1||i==n) ) )
    	            System.out.print(printprime(n,++k)+" ");
    	        else
    	            System.out.print("  ");
    		}
    	    System.out.println();
    	}
    }
}
public class Cross_Prime implements Pattern,Prime{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value : ");
	    int n=sc.nextInt();
	    Cross_Prime o=new Cross_Prime();
		o.pattern(n);
	}
}