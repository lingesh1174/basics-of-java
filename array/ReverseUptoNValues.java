public class ReverseUptoNValues{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=3;
        for(int i=1;i*n<arr.length;i++){
            int a=n*i;
            for(int j=a-1;j>=a-n;j--){
                System.out.print(arr[j]);
            }
        }
        int rem=arr.length%n;
        for(int i=arr.length-1;i>=arr.length-rem;i--){
            System.out.print(arr[i]);
        }
    }
}