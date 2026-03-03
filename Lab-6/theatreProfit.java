import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class profitCalc{
    int people;
    double pro;
    profitCalc(int people)
    {
        this.people=people;
    }
    double theatrepro(int people)
    {
        pro=people*4.5-20;
        return pro;
    }
}
public class theatreProfit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of people: ");
        int people = sc.nextInt();
        profitCalc p = new profitCalc(people);
        System.out.println("Profit is "+p.theatrepro(people));
    }
}
