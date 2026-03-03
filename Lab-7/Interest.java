import java.util.Scanner;

class NegativeInputException extends Exception
{
    public NegativeInputException(String msg)
    {
        super(msg);
    }
}


public class Interest
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE PRINCIPAL AMOUNT:");
        double principalAmount = scanner.nextDouble();
        System.out.print("ENTER THE ANNUAL INTEREST RATE:");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("ENTER THE NUMBER OF MONTHS:");
        double months = scanner.nextInt();
        try
        {
            if(months < 0 || principalAmount < 0 || annualInterestRate < 0)
            {
                throw new NegativeInputException("INPUT CANNOT BE NEGATIVE!");
            }
        }
        catch(NegativeInputException ex)
        {
            ex.printStackTrace();
            System.exit(0);
        }
        double years = months/12.0;
        System.out.println("TOTAL AMOUNT IS:"+(principalAmount*annualInterestRate*years));
        scanner.close();
    }
}