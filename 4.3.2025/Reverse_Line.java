import java.util.Scanner;
public class Reverse_Line {
    static void revLine(String str){
        String res="",str2="";
        int n=str.length()-1;
        for(int i=n;i>=0;i--){
            if(i==n && str.charAt(n)==' ')
                continue;
            else if(str.charAt(i)==' '&& (str.charAt(i+1)!=' '|| i==n) && str2!=""){
                res+=str2+' ';
                str2="";
            }
            else if(str.charAt(i)!=' ')
                str2=str.charAt(i)+str2;
        }
        res+=str2;
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        revLine(str);
    }
}