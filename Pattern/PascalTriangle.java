import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n; i>n-1; i--) {
            int num=1;
            for (int j=n-i-1; j>0; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++) {
                System.out.print(num + " ");
                num = num*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}