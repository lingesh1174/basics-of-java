import java.util.*;
public class SecondMaximum
{
	public static void main(String[] args) {
	    int arr[]={20,60,10,40,50,30};
	    int max=arr[0],secmax=arr[0],sec=0;
		for(int i=1;i<arr.length;i++){
		    if(max<arr[i])
		        max=arr[i];
		}
		for(int j=1;j<arr.length;j++){
		    if(arr[j]>secmax && arr[j]<max)
		        secmax=arr[j];
		}
		System.out.println(secmax);
		
		for(int i=1;i<arr.length;i++){
		    if(max<arr[i])
		        sec=max;
		        max=arr[i];
		}
		System.out.println(sec);


		Arrays.sort(arr);
		int last=arr.length-1;
		System.out.println(arr[last-1]);
	}
}