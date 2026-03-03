package Q1;
class figure {
    double r, a, v;

    public void dispArea() {
        System.out.println("The Area (a) is: " + a);
    }

    public void dispVolume() {
        System.out.println("The Volume (v) is: " + v);
    }
}

class cone extends figure {

    double h, s;
    double p = Math.PI;

    cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public void calcArea() {
        a = (p * r * s) + (p * r * r);
    }

    public void calcVolume() {
        v = (p * r * r * h) / 3;
    }
}

public class InheritDemo {
    public static void main(String[] args) {
        cone myCone = new cone(5.0, 10.0, 12.0);

        myCone.calcArea();
        myCone.calcVolume();

        myCone.dispArea();
        myCone.dispVolume();
    }
}