import java.util.Scanner;
class hex{
    String s = new String();
    hex(String s){
        this.s=s;
    }
    boolean check()
    {
        char ch;
     for(int i=0;i<s.length();i++)
     {
         ch=s.charAt(i);
         if('a'<=ch&&ch<='f');
         else if('A'<=ch&&ch<='F');
         else if('1'<=ch&&ch<='9');
         else return false;
     }
     return true;
    }
}
public class HexCheck {
    public static void main(String [] args)
    {   Scanner sc =new Scanner(System.in);
        String S=new String();
        System.out.println("Enter your fucking String you stupid fucking idiota: ");
        S=sc.nextLine();
        hex h =new hex(S);
        System.out.println("Entered string is hexadecimal: "+h.check());
    }
}
