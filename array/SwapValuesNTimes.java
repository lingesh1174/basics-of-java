import java.util.*;
public class SwapValuesNTimes
{
	public static void main(String[] args) {
	    int arr[]={10,20,5,1,3,2};
	    Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
	    int size=arr.length;
	    while(n>0){
	        int temp=arr[size-1];
	        for(int i=size-1;i>=0;i--){
	            if(i>0)
	                arr[i]=arr[i-1];
	            else
	                arr[0]=temp;
	        }
	           for(int j=0;j<size;j++)
	                System.out.print(arr[j]+"\t");
	        System.out.print("\n");
	        n--;
	    }
	}
}