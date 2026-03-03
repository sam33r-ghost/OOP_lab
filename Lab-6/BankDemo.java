import java.util.Scanner;
class bank
{   static int balance=0;
    int deposit(int val){
        balance+=val;
        System.out.println("Balance is: "+balance);
        return balance;
    }
    int withdraw(int val)
    {
        if(val>=balance)return 0;
        else balance-=val;
        System.out.println("Balance is: "+balance);
        return balance;
    }

}
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank b = new bank();
        System.out.println("Enter amount to deposit: ");
        int deposit=sc.nextInt();
        b.deposit(deposit);
        System.out.println("Enter amount ot withdraw: ");
        int withdraw = sc.nextInt();
        b.withdraw(withdraw);
        System.out.println("Enter amount to deposit: ");
        deposit=sc.nextInt();
        b.deposit(deposit);
        System.out.println("Enter amount ot withdraw: ");
        withdraw = sc.nextInt();
        b.withdraw(withdraw);


    }
}
