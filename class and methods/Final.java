abstract class Main2{
    final void display(){
        System.out.println("Final Method");
    }
}
public class Final extends Main2
{
    void display(int a){
        System.out.println("Main method : "+a);
    }
	public static void main(String[] args) {
	    Final o=new Final();
		o.display();
		o.display(15);
	}
}