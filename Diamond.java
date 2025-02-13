public class Diamond
{
	public static void main(String[] args) {
	    int n=4;
	    for(int i=1;i<=n;i++){
	        for(int k=n-i;k>0;k--)
	            System.out.print(" ");
	        for(int l=1;l<i;l++)
	           System.out.print(l);
	        for(int j=i;j>=1;j--)
	           System.out.print(j);
	        System.out.print("\n");
	    }
	    for(int i=n-1;i>=1;i--){
	        for(int j=n-i;j>0;j--)
	            System.out.print(" ");
	        for(int k=1;k<i;k++)
	            System.out.print(k);
	        for(int l=i;l>=1;l--)
	            System.out.print(l);
	        System.out.print("\n");
	    }
	    
	    
	    
	   for(int i=1;i<=n;i++){
	        for(int k=n-i;k>0;k--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.print("\n");
	    }
	    for(int i=n-1;i>0;i--){
	        for(int k=n-i;k>0;k--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.print("\n");
	    }
	    
	    
	    
	    for(int i=1;i<=n;i++){
	        for(int k=n-i;k>0;k--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i*2-1;j++){
	            if(j==1||j==i*2-1)
	                System.out.print("*");
	            else if(j%2==0)
	                System.out.print(" ");
	            else
	                System.out.print(0);
	        }
	        System.out.print("\n");
	    }
	    for(int i=n-1;i>0;i--){
	        for(int k=n-i;k>0;k--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i*2-1;j++){
	            if(j==1||j==i*2-1)
	                System.out.print("*");
	            else if(j%2==0)
	                System.out.print(" ");
	            else
	                System.out.print(0);
	        }
	        System.out.print("\n");
	    }
	    
	    
	    
	}
}