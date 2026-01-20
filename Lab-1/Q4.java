import java.util.Scanner;
import java.lang.Math;
public class Q4
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int radius=s.nextInt();
        System.out.println("Area is "+ (radius*(Math.PI)));
    }
}
