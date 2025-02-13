public class Pyramid
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print("|");
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(i);
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(j);
	        }
	        System.out.print("\n");
	    }
	    
	    
	    int num=1;
	    for(int i=1;i<=4;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(num);
	            num++;
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++){
	        for(int k=n-i;k>0;k--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print("|");
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++){
	        for(int k=n-i;k>0;k--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i*2-1;j++){
	            System.out.print("|");
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++){
	        for(int k=n-i;k>0;k--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print(" *");
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++){
	        for(int k=n-i;k>0;k--)
	            System.out.print(" ");
	        for(int l=1;l<i;l++)
	           System.out.print(l);
	        for(int j=i;j>=1;j--)
	           System.out.print(j);
	        System.out.print("\n");
	    }
		
		
		for(int i=1;i<=n;i++){
	        for(int k=n-i;k>0;k--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i*2-1;j++){
	            if(i==n||j==1||j==i*2-1)
	                System.out.print("*");
	            else
	                System.out.print(0);
	        }
	        System.out.print("\n");
	    }
	}
}