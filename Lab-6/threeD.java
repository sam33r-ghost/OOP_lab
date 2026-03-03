import java.util.Scanner;

class Point {

    int a;
    int b;
    int c;

    Point() {
        a = 0;
        b = 0;
        c = 0;
    }

    Point(int x1, int y1, int z1) {
        a = x1;
        b = y1;
        c = z1;
    }

    void in() {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
    }

    void out() {
        System.out.println("(" + a + "," + b + "," + c + ")");
    }

    double dist(Point other) {
        int d1 = a - other.a;
        int d2 = b - other.b;
        int d3 = c - other.c;

        return Math.sqrt(d1*d1 + d2*d2 + d3*d3);
    }
}

public class threeD{
    public static void main(String[] args) {

        Point point = new Point();
        point.in();

        Point point1 = new Point(1,2,3);

        point1.out();
        point.out();

        double ans = point.dist(point1);
        System.out.println("d = " + ans);
    }
}