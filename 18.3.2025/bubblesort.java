import java.util.Scanner;

public class bubblesort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void bubble(int arr[],int n){
        for(int j=0;j<n;j++){
            for(int i=0;i<n-j;i++){
                if(i!=n-1 && arr[i]>arr[i+1])
                    swap(arr,i,i+1);
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        bubble(arr, n);
    }
}
