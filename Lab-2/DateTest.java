
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month(number) : ");
        int m = sc.nextInt();
        System.out.println("Enter date(number) : ");
        int d = sc.nextInt();
        System.out.println("Enter Year : ");
        int y = sc.nextInt();
        date day = new date(m, d, y);
        System.out.println("The date is : " + day.getD() + "/" + day.getM() + "/" + y);
        sc.close();
    }
}
final class date{
    int m,d,y;
    public date(int m,int d,int y) {
        setD(d);
        setM(m);
        this.y=y;
    }
    public void setYear(int y){
        this.y = y;
    }
    public void setM(int m) {
        if(m>0 && m<=12){
            this.m=m;
        }
    }
    public void setD(int d) {
        this.d=d;
    }
    public int getD() {
        return d;
    }
    public int getM() {
        return m;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

}
