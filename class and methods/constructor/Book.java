public class Book
{
    String title;
    double price;
    Book(){
        title="Java Programming";
        price=100.0;
        display();
    }
    public void display(){
        System.out.println("Book title : "+title);
        System.out.println("Book price : "+price);
    }
	public static void main(String[] args) {
        Book o=new Book();
	}
}