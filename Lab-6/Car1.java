abstract class Car {

    String brand;
    Car(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
    abstract void avg();
    abstract void model();
}
class BMW extends Car {

    BMW(String brand) {
        super(brand);
    }

    void avg() {
        System.out.println("Average: 22 km/l");
    }

    void model() {
        System.out.println("S series");
    }
}

class Lamborgini extends Car {

    Lamborgini(String brand) {
        super(brand);
    }

    void avg() {
        System.out.println("Average: 5 km/l");
    }

    void model() {
        System.out.println("Gallardo");
    }
}

public class Car1 {
    public static void main(String[] args) {


        Car car;
        car = new BMW("Volkswagen");
        car.display();
        car.model();
        car.avg();

        System.out.println();

        car = new Lamborgini("Ferrari");
        car.display();
        car.model();
        car.avg();
    }
}