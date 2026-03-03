import java.util.Scanner;
class Book{
    int bookID;
    String title;
    String author;
    double price;
    Book(int bookID,String title,String author,double price)
    {
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.price=price;
    }
}
class Periodical extends Book{
    String period;
    void changePeriodical(String period){
        this.period=period;
    }
    void changePrice(double price){
        this.price=price;
    }
    Periodical(int bookID,String title,String author,double price,String period)
    {
        super(bookID,title,author,price);
        this.period=period;
    }
    void disp(){
        System.out.println("BookID: "+bookID );
        System.out.println("Title: "+title);
        System.out.println("author: "+author);
        System.out.println("price: "+price);
        System.out.println("period: "+period);
    }

}
class NegativeException extends Exception{
    public NegativeException(String msg){
        super(msg);
    }
}
public class BookDemo {
public static void main(String[] args)
{
    Periodical p=new Periodical(90831,"Harry Potter","J.K.Rowling",250.0,"Monthly");
    Scanner sc=new Scanner(System.in);
    p.disp();
    System.out.println("Enter new price of Book: ");
    double price=sc.nextDouble();
    try{
        if(price<0)throw new NegativeException("Price can't be negative ");
    }catch(NegativeException e){
        e.printStackTrace();
        System.exit(0);
    }
    p.changePrice(price);
    System.out.println("Enter new period for periodical: ");
    String buffer=sc.nextLine();
    String period = sc.nextLine();
    p.changePeriodical(period);
    p.disp();
}
}

