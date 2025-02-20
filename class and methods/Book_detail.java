public class Book_detail
{
    String title,author;
    int price;
    Book_detail(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Book title : "+title+"\nAuthor : "+author+"\nPrice : "+price);
    }
	public static void main(String[] args) {
		Book_detail o = new Book_detail("ABC","cde",123);
		o.display();
	}
}