import java.util.Scanner;
class vehicle{
    String brand;
    double speed;
    void maxSpeed(){
        System.out.println("The speed of general vehicle not defined");
    }
    vehicle(String brand){
        this.brand=brand;
    }
}
class NegaitveInputException extends Exception{
    public NegaitveInputException(String msg){
        super(msg);
    }
}
class car extends vehicle{
    int numDoors;
    car(String brand,int numDoors,double speed)
    {
            super(brand);
            this.speed=speed;
            this.numDoors=numDoors;
    }
    @Override
    void maxSpeed(){
        System.out.println("Car of brand "+brand+" with "+ numDoors+" doors "+"has maximum speed "+speed+"km/hr");
    }
}
class bicycle extends vehicle{
    int numtyres;
    bicycle(String brand,int numtyres,double speed)
    {
        super(brand);
        this.speed=speed;
        this.numtyres=numtyres;
    }
    @Override
    void maxSpeed(){
        System.out.println("bicycle of brand "+brand+" with "+ numtyres+" tryes "+"has maximum speed "+speed+"km/hr");
    }
}
class scooter extends vehicle{
    int numtyres;
    scooter(String brand,int numtyres,double speed)
    {
        super(brand);
        this.speed=speed;
        this.numtyres=numtyres;
    }
    @Override
    void maxSpeed(){
        System.out.println("Scooter of brand "+brand+" with "+ numtyres+" tyres "+"has maximum speed "+speed+"km/hr");
    }
}
public class vehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car brand: ");
        String brand = sc.nextLine();
        System.out.println("Enter max speed");
        double speed = sc.nextDouble();
        System.out.println("Enter number of doors: ");
        int numDoors=sc.nextInt();

        System.out.println();
        try {
            if (speed < 0 || numDoors < 0) {
                throw new NegativeInputException("INPUT CANNOT BE NEGATIVE!");
            }
        } catch (NegativeInputException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        car c=new car(brand,numDoors,speed);
        c.maxSpeed();

        System.out.println("Enter Bicycle brand: ");
        String buffer =sc.nextLine();
        brand = sc.nextLine();
        System.out.println("Enter max speed");
        speed = sc.nextDouble();
        System.out.println("Enter number of tyres: ");
        int numTyres=sc.nextInt();

        System.out.println();
        try {
            if (speed < 0 || numTyres < 0) {
                throw new NegativeInputException("INPUT CANNOT BE NEGATIVE!");
            }
        } catch (NegativeInputException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        bicycle b=new bicycle(brand,numDoors,speed);
        b.maxSpeed();

        System.out.println("Enter Scooter brand: ");
        buffer=sc.nextLine();
        brand = sc.nextLine();
        System.out.println("Enter max speed");
        speed = sc.nextDouble();
        System.out.println("Enter number of tyres: ");
        numTyres=sc.nextInt();

        System.out.println();
        try {
            if (speed < 0 || numTyres < 0) {
                throw new NegativeInputException("INPUT CANNOT BE NEGATIVE!");
            }
        } catch (NegativeInputException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        scooter s=new scooter(brand,numDoors,speed);
        s.maxSpeed();
    sc.close();
    }
}