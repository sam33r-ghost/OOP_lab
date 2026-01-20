
import java.util.Scanner;

public class creditcard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number : ");
        int acc = sc.nextInt();
        System.out.println("Enter balance at the beginning of the month : ");
        int bal = sc.nextInt();
        System.out.println("Enter total of all items charged by the customer this month : ");
        int charge = sc.nextInt();
        System.out.println("Enter total of all credits applied to the customer this month : ");
        int credit = sc.nextInt();
        System.out.println("Enter credit limit : ");
        int limit = sc.nextInt();
        checker c = new checker(acc, bal, charge, credit, limit);
        c.checklimit();
    }
}
class checker{
    int acc, bal, charge, credit, limit;
    checker(int acc, int bal, int charge, int credit, int limit){
        this.acc = acc;
        this.bal = bal;
        this.charge = charge;
        this.credit = credit;
        this.limit = limit;
    }
    void checklimit(){
        int newbal = bal + charge - credit;
        if(newbal > limit){
            System.out.println("Credit limit exceeded.");
        }else{
            System.out.println("Remaining balance : " + (limit - newbal));
        }
    }
}
