import java.util.Scanner;
public class CalculateArea
{
    static int area(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int square= a*a;
        return square;
    }
    static double area(int a){
        double circle=3.14*a*a;
        return circle;
    }
    static int area(int a,int b){
        int rectangle=a*b;
        return rectangle;
    }
	public static void main(String[] args) {
		System.out.println("Area of square : "+area());
		System.out.println("Area of circle : "+area(11));
		System.out.println("Area of rectangle : "+area(10,6));
	}
}