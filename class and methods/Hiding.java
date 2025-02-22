class Supermost{
    private int a=25;
    int get(){
        return a;
    }
}
class Super extends Supermost{
    protected int b=18;
}
class Sub extends Super{
    int c=78;
    void display(){
        System.out.println(get());
        System.out.println(b);
        System.out.println(c);
    }
}
public class Hiding
{
	public static void main(String[] args) {
		Sub s=new Sub();
		s.display();
	}
}