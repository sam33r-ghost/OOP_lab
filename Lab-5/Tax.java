import java.util.Scanner;

public class Tax {
    float base = 12;
    double hours;

    public Tax() {}

    public Tax(double hours) {
        this.hours = hours;
    }

    public double calcNetPay() {
        return hours * base;
    }

    public double calculateTaxAmount() {
        return 0.15 * this.calcNetPay();
    }

    public void disp() {
        System.out.printf("Base Pay: %.2f\n", this.calcNetPay());
        System.out.printf("Tax: %.2f\n", this.calculateTaxAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tax t = new Tax();
        Tax t1 = new Tax();

        System.out.println("Enter number of hours worked (t): ");
        t.hours = sc.nextDouble();

        System.out.println("Enter number of hours worked (t1): ");
        t1.hours = sc.nextDouble();

        t.disp();
        t1.disp();

        sc.close();
    }
}