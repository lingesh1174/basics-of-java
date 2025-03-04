import java.util.Scanner;

public class Substring1 {
    static void sstring(String str,int i,int j){
        String str2="";
        for(int a=i;a<j;a++)
            str2=str2+str.charAt(a);
        System.out.println(str2);
    }
    static void sstring(String str,int i){
        String str2="";
        for(int a=i;a<str.length();a++)
            str2=str2+str.charAt(a);
        System.out.println(str2);
    }
    static void sbuilder(String str){
        StringBuilder str2=new StringBuilder(str);
        String str3= str2.substring(5);
        System.out.println(str3);
    }
    static void sbuffer(String str){
        StringBuffer str2=new StringBuffer(str);
        String str3=str2.substring(1,7);
        System.out.println(str3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sstring(str,3,8);
        sbuilder(str);
        sbuffer(str);
    }
}