import java.util.Scanner;
public class No_of_Times {
    static void used(String str){
        int num=0;
        String str2="",ch="";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                num=num*10+(str.charAt(i)-'0');
                if((i<str.length()-1 && !Character.isDigit(str.charAt(i+1)))||(i==str.length()-1)){
                    while(num>0){
                        str2=str2+ch;
                        num--;
                    }
                    ch="";
                }
            }
            else
                ch=ch+str.charAt(i);
        }
        if(ch!="")
            str2=str2+ch;
        System.out.println(str2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        used(str);
    }
}