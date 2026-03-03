package q4;
abstract class Figure {
    double pi = 3.1420;
    double a;
    double v;
    double r;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();
}
class Cone extends Figure {
    double n;
    double s;
    Cone(double n, double s, double r) {
        this.n = n;
        this.s = s;
        this.r = r;
    }
    public void calcArea() {
        a = (pi*r*s)+(pi*r*r);
    }
    public void calcVol() {
        v = (pi*r*r*n)/3;
    }
    public void DispArea() {
        System.out.println("Cone Area = " + a);
    }
    public void Dispvol() {
        System.out.println("Cone Volume = " + v);
    }
}
class Sphere extends Figure {
    Sphere(double r) {
        this.r = r;
    }
    public void calcArea() {
        a = 4*pi*r*r;
    }
    public void calcVol() {
        v = (4*pi*r*r*r)/3;
    }
    public void DispArea() {
        System.out.println("Sphere Area = " + a);
    }
    public void Dispvol() {
        System.out.println("Sphere Volume = " + v);
    }
}
class Cylinder extends Figure {
    double h;
    Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }
    public void calcArea() {
        a = (2*pi*r*h) + (2*pi*r*r);
    }
    public void calcVol() {
        v = pi*r*r*h;
    }
    public void DispArea() {
        System.out.println("Cylinder Area = " + a);
    }
    public void Dispvol() {
        System.out.println("Cylinder Volume = " + v);
    }
}
public class four {
    public static void main(String[] args) {
        Cone c = new Cone(7, 10, 12);
        c.calcArea();
        c.calcVol();
        c.DispArea();
        c.Dispvol();
        Sphere s = new Sphere(5);
        s.calcArea();
        s.calcVol();
        s.DispArea();
        s.Dispvol();
        Cylinder cy = new Cylinder(4, 9);
        cy.calcArea();
        cy.calcVol();
        cy.DispArea();
        cy.Dispvol();
    }
}