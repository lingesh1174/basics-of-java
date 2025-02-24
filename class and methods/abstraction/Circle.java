import java.util.Scanner;
abstract class Circle{
    static double area;
    static double circumference;
    static void cal_area(int r){
        area=3.14*r*r;
        System.out.println("Area : "+area);
    }
    static void cal_circum(int r){
        circumference=2*3.14*r;
        System.out.println("circumference : "+circumference);
    }
    abstract void cal_circumference();
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		cal_area(r);
		cal_circum(r);
	}
}