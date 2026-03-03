import java.util.Scanner;

public class StringCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int len = str.length();

        for (int i = 0; i < len; i++) {

            char ch = str.charAt(i);
            int count = 0;

            int checked = 0;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    checked = 1;
                    break;
                }
            }

            if (checked == 1)
                continue;

            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > n) {
                System.out.println(ch + " occurs " + count + " times");
            }
        }
    }
}