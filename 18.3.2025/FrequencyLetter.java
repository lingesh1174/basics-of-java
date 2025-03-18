import java.util.Scanner;
public class FrequencyLetter {
    static void counter(String a,char ch){
        int count=0;
        for(int i=0;i<a.length();i++){
            if(ch==a.charAt(i))
                count++;
        }
        System.out.println(ch+" : "+count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        a=a.toLowerCase();
        int count=0;
        boolean flag=false;
        for(int i=0;i<a.length();i++){
            for(int j=0;j<i;j++){
                if(a.charAt(i)==a.charAt(j)){
                    flag=true;
                    break;    
                }
            }
            if(!flag){
                counter(a,a.charAt(i));
            }
            flag=false;
        }
    }
}
