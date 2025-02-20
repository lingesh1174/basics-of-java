import java.util.Scanner;
public class Car
{
    String brand;
    Car(){
        brand="Unknown";
    }
    void setBrand(){
        System.out.println("old brand : "+brand);
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new brandname:");
		brand=sc.next();
		System.out.println("brand : "+brand);
    }
	public static void main(String[] args) {
	    Car o=new Car();
	    o.setBrand();
	}
}