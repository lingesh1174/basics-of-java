class Parent{
    public int publicm(){
        int a=1;
        return a;
    }
    private int privm(){
        int b=2;
        return b;
    }
    int defm(){
        int c=3;
        return c;
    }
    static int stam(){
        int d=4;
        return d;
    }
    protected int protm(){
        int e=5;
        return e;
    }
    int get(){
        return privm();
    }
}
class Child extends Parent{
    public int publicm(){
        int f=6;
        return f;
    }
    int defm(){
        int g=7;
        return g;
    }
    protected int protm(){
        int h=8;
        return h;
    }
    static int stam(){
        int d=135;
        return d;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Child c=new Child();
	    Parent p=new Child();
		System.out.println(c.defm());
		System.out.println(c.publicm());
		System.out.println(c.protm());
		System.out.println(c.stam());
		System.out.println(c.get());
		System.out.println(p.publicm());
		System.out.println(p.stam());
	}
}