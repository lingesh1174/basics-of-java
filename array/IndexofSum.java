import java.util.*;
public class IndexofSum{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
	    for(int i=0;i<size;i++)
	        arr[i]=sc.nextInt();
	    System.out.println("Enter n value:");
	    int n=sc.nextInt();
	    for(int i=0;i<size;i++){
	        for(int j=i+1;j<size;j++){
	            if(arr[i]+arr[j]==n){
	                System.out.println(i+" , "+j);
	                break;
	            }
	        }
	    }
	}
}