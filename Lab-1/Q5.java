import java.util.Scanner;
public class Q5
{
public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int num= s.nextInt();
        int sum=0,n=num;
        while(n!=0)
        {
            int q =n%10;
            sum=q+10*sum;
            n=n/10;
        }
        while(sum!=0)
        {
            int q=sum%10;
            System.out.print(q+"   ");
            sum=sum/10;
        }
    }
}
