import java.util.Scanner;
class Product{
    int prodID;
    String name;
    int catID;
    double unitPrice;
}
class electricProd extends Product{
    double voltageRange;
    double wattage;
    void change(double v1,double v2)
    {
        this.voltageRange=v1;
        this.unitPrice=v2;
    }
    void display()
    {
        System.out.println("Product ID: "+prodID);
        System.out.println("Name: "+ name);
        System.out.println("Category ID: "+ catID);
        System.out.println("Unit price: "+ unitPrice);
        System.out.println("Voltage range: "+voltageRange);
        System.out.println("Wattage: "+ wattage);
    }
}
public class prod {
    public static void main(String[] args) {
        int i;
        electricProd p = new electricProd();
        Scanner sc= new Scanner(System.in);
        System.out.println("Product ID: ");
        p.prodID=sc.nextInt();
        System.out.println("Name: ");
        p.name= sc.nextLine();
        System.out.println("Category ID: ");
        p.catID=sc.nextInt();
        System.out.println("Unit price: ");
        p.unitPrice=sc.nextDouble();
        System.out.println("Voltage range: ");
        p.voltageRange= sc.nextDouble();
        System.out.println("Wattage: ");
        p.wattage=sc.nextDouble();
        System.out.println("do you wish to change the wattage and price of the product: press 1");
        i= sc.nextInt();
        if(i==1){
            double v1,v2;
            System.out.println("Wattage: ");
            v1= sc.nextDouble();
            System.out.println("Unit price: ");
            v2= sc.nextDouble();
            p.change(v1,v2);
        }
        p.display();
    }
}
