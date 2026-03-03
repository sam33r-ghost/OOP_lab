import java.util.Scanner;
public class Perfect {
    public static void main(String[]args)
    {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String arr = sc.nextLine();
        for(int i=0;i<arr.length();i++)
        {
            char x= arr.charAt(i);
            for(int j=i+1;j<arr.length();j++)
            {
                if(arr.charAt(j)==x)
                {
                    flag =1;
                    break;
                }
            }

        }
        if(flag==0)
        {
            System.out.println("String is perfect");
        } else {
            System.out.println("String is not perfect"); 
        }
    }
}
