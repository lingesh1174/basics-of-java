import java.util.Scanner;
abstract class Circle{
    protected double area;
    abstract void calc_area();
}
class Area extends Circle{
    private double r;
    public Area(){
        Scanner in=new Scanner(System.in);
        r=in.nextDouble();
    }
    void calc_area(){
        area=3.14*r*r;
        System.out.println("Area : "+area);
    }
	public static void main(String[] args) {
		Area o=new Area();
		o.calc_area();
	}
}