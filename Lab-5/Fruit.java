import java.util.Scanner;
public class Fruit {
    String name;
    int quantity;
    double price;
    Fruit(String name,int quantity,double price)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("quantity: "+quantity);
        System.out.println("price: "+price);
        System.out.println("total: "+(quantity*price));
        System.out.println();
    }
}
class bill{
    public static void main(String[] args)
    {
        Fruit fruit= new Fruit("apple",5,249.5);
        Fruit fruit1= new Fruit("orange",11,25.5);
        Fruit fruit2= new Fruit("pomegranate",8,59.5);
        fruit.display();
        fruit1.display();
        fruit2.display();
    }
}
