import java.util.Scanner;
class operator{
    int a,b,c,max,min;
   int sum (){return a+b+c;}
    int average (){ return (sum()/3);}
        int product() { return (a *b*c);}



}
public class Q3
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        operator o=new operator();
        System.out.println("Enter value of first number: ");
        o.a=s.nextInt();
        o.max=o.a;
        o.min=o.a;
        System.out.println("Enter value of second number: ");
        o.b=s.nextInt();
        if(o.b>o.max)
            o.max=o.b;
        else if (o.b<o.min) {
            o.min=o.b;
        }
        System.out.println("Enter value of third number: ");
        o.c=s.nextInt();
        if (o.c>o.max)
            o.max=o.c;
        else if (o.c<o.min) {
            o.min=o.c;
        }
        System.out.println("Sum is: "+ o.sum());
        System.out.println("Average is: "+ o.average());
        System.out.println("Product is: "+ o.product());
        System.out.println("Maximum is: "+ o.max);
        System.out.println("Minimum is: "+o.min);
    }
}
