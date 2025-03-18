import java.util.Scanner;
public class Swap_ith_jth_bit {
    static String binary(int a){
        String str="";
        int count=0;
         while(a>0){
            int rem=a%2;
            a/=2;
            str=rem+str;
            count++;
         }
         int i=32;
         while(i>count){
            str="0"+str;
            i--;
         }
        return str;
    }
    static String swap(String a,int i,int j){
        char arr[]=a.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        a="";
        for(int k=0;k<arr.length;k++)
            a+=arr[k];
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),i=sc.nextInt(),j=sc.nextInt();
        String str1=binary(n);
        String str2=swap(str1,i-1,j-1);
        System.out.println(str1+"\n"+str2);
    }
}