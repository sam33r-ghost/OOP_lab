

import java.util.Scanner;
public class gas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tmiles = 0;
        double fule = 0;
        double miles = 0;
        while (miles != -1) {
            System.out.println("Enter miles driven (-1 to stop): ");
            miles = sc.nextDouble();
            System.out.println("Enter gallons : ");
            double gallons = sc.nextDouble();
            gasmileage g = new gasmileage(miles, gallons);
            System.out.println("Miles per gallon for this trip: " + g.mpg());
            tmiles += miles;
            fule += gallons;
        }
        System.out.println("Combined miles per gallon: " + (tmiles/fule));
        sc.close();
    }
}

class gasmileage {
    double miles, gallons;
    gasmileage(double miles, double gallons) {
        this.miles = miles;
        this.gallons = gallons;
    }
    double mpg() {
        return miles / gallons;
    }
}
