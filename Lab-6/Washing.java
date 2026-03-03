import java.util.Scanner;
class Machine
{  static int count=0;
    void switchOn()
    {
        System.out.println("Machine is on");
    }
    void switchOff()
    {
        System.out.println("Machine is OFf");
    }
    int acceptClothes(int k)
    {
        count+=k;
        return count;
    }
    void acceptDetergent(){
        System.out.println("Detergent added");
    }
}
public class Washing {
    public static void main() {
        Machine m=new Machine();
        Scanner sc=new Scanner(System.in);
        m.switchOn();
        m.acceptDetergent();
        System.out.println("How many clothes did you put in: ");
        int k=sc.nextInt();
        System.out.println("Current number of clothes: "+m.acceptClothes(k));
        m.switchOff();
    }
}
