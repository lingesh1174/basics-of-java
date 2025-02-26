interface Interface1{
    void display1();
    static void display2(){
        System.out.println("Interface 1 static");
    }
    default void display3(){
        System.out.println("Interface 1 default");
    }
}
interface Interface2 extends Interface1{
    void display1();
    static void display2(){
        System.out.println("Interface 2 static");
    }
    default void display3(){
        System.out.println("Interface 2 default");
    }
}
class Main2 implements Interface1,Interface2{
    public void display1(){
		    System.out.println("Display 1");
	}
}
public class Interface_methods{
    	public static void main(String[] args) {
	    Main2 o=new Main2();
        o.display1();
	    Interface1.display2();
	    Interface2.display2();
	    o.display3();
	}
} 