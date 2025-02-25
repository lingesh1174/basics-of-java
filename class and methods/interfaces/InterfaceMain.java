interface SBI{
    void getInfo();
    double balance=8843.98;
    long accno=687654;
}
interface IndianBank{
    void getInfo();
    /*double balance=9999.98;
    long accno=887652;*/
    default void get(){
        System.out.println("Hello from Indian Bank");
    }
}
interface CUB{
    void getInfo();
    /*double balance=70543.98;
    long accno=987654;*/
}
class RBI implements SBI,IndianBank,CUB{
    public void getInfo(){
        System.out.println("acc no : "+accno+"\nbalance :"+balance);
    }
}
public class InterfaceMain
{
	public static void main(String[] args) {
	    RBI o=new RBI();
	    o.getInfo();
	    o.get();
	}
}