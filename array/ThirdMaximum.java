import java.util.*;
public class ThirdMaximum
{
	public static void main(String[] args) {
	    int arr[]={20,60,10,40,50,30};
	    int max=arr[0],secmax=arr[0],thirdmax=arr[0];
		for(int i=1;i<arr.length;i++){
		    if(max<arr[i])
		        max=arr[i];
		}
		for(int j=1;j<arr.length;j++){
		    if(arr[j]>secmax && arr[j]<max)
		        secmax=arr[j];
		}
		for(int k=1;k<arr.length;k++){
		    if(arr[k]>thirdmax && arr[k]<secmax)
		        thirdmax=arr[k];
		}
		System.out.println(thirdmax);
		
		Arrays.sort(arr);
		int last=arr.length-1;
		System.out.println(arr[last-2]);
	}
}