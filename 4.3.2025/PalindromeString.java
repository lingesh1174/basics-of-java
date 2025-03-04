import java.util.Scanner;
public class PalindromeString {
    static boolean without(String str){
        int n=str.length()-1;
        boolean istrue=true;
        for(int i=0;i<(n/2);i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                istrue=false;
                break;
            }
        }
        return istrue;
    }
    static boolean sbuilder(String str){
        StringBuilder str2=new StringBuilder(str);
        str2=str2.reverse();
        if(str.equals(str2.toString()))
            return true;
        else
            return false;
    }
    static boolean sbuffer(String str){
        StringBuffer str2=new StringBuffer(str);
        str2=str2.reverse();
        if(str.equals(str2.toString()))
            return true;
        else
            return false;
    }
    static boolean sstring(String str){
        String str2="";
        for(int i=str.length()-1;i>=0;i--)
            str2=str2+str.charAt(i);
        if(str.equals(str2))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=str.toUpperCase();
        System.out.println(str+" is a palindrome : "+without(str));
        System.out.println(str+" is a palindrome : "+sbuilder(str));
        System.out.println(str+" is a palindrome : "+sbuffer(str));
        System.out.println(str+" is a palindrome : "+sstring(str));
    }
}
