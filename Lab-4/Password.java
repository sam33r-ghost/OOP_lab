import java.util.Scanner;

public class Password {

    static boolean isValidPassword(String pwd) {

        int len = pwd.length();

        if (len < 5 || len > 12)
            return false;

        int lowercase = 0;
        int digit = 0;

        for (int i = 0; i < len; i++) {
            char ch = pwd.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                lowercase = 1;
            else if (ch >= '0' && ch <= '9')
                digit = 1;
            else
                return false;
        }

        if (lowercase == 0 || digit == 0)
            return false;

        for (int i = 0; i < len - 1; i++) {
            if (pwd.charAt(i) == pwd.charAt(i + 1))
                return false;
        }

        for (int i = 0; i < len - 3; i++) {
            if (pwd.charAt(i) == pwd.charAt(i + 2) &&
                    pwd.charAt(i + 1) == pwd.charAt(i + 3))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = scanner.nextLine();

        if (isValidPassword(pwd))
            System.out.println("Password Accepted");
        else
            System.out.println("Password Rejected");
    }
}
