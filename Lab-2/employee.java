
import java.util.Scanner;
public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first employee details:");
        System.out.print("First Name: ");
        String name1 = sc.nextLine();
        System.out.print("Last Name: ");
        String last1 = sc.nextLine();
        System.out.print("Monthly Salary: ");
        double salary1 = sc.nextDouble();
        emp e1 = new emp(name1, last1, salary1);
        System.out.println("Enter second employee details:");
        sc.nextLine();
        System.out.print("First Name: ");
        String name2 = sc.nextLine();
        System.out.print("Last Name: ");
        String last2 = sc.nextLine();
        System.out.print("Monthly Salary: ");
        double salary2 = sc.nextDouble();
        emp e2 = new emp(name2, last2, salary2);
        e2.setSalary(e2.getSalary()*1.1*12);
        e1.setSalary(e1.getSalary()*1.1*12);
        System.out.println("First Employee Salary : " + e1.getSalary());
        System.out.println("Second Employee Salary : " + e2.getSalary());
    }
}
final class emp{
    String name,last;
    double salary;
    emp(String name,String last,double salary){
        this.name = name;
        setSalary(salary);
    }
    public String getName(){
        return name;
    }
    public String getLast() {
        return last;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
        }
    }
    public void setLast(String last){
        this.last = last;
    }
    public void setName(String name){
        this.name = name;
    }

}
