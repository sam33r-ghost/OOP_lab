import java.util.Scanner;
class parent{
    int i,j;
    parent(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    int sum(){
        return i+j;
    }

}
class child extends parent{
    int k;
    child(int i,int j,int k){
        super(i,j);
        this.k=k;
    }
    int sum2(){
        return i+j+k;
    }
}
public class Demo
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter i: ");
        int i=sc.nextInt();
        System.out.println("Enter j: ");
        int j=sc.nextInt();
        System.out.println("Enter k: ");
        int k=sc.nextInt();
        parent p = new parent(i,j);
        child c=new child(i,j,k);
        System.out.println("Parent sum: "+p.sum());
        System.out.println("Child sum: "+c.sum2());
    }
}