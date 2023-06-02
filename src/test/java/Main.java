public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); // Upcasting

//         Downcasting
        Car car = (Car) vehicle;
        car.start(); // Accessing the method specific to Car class

//         Incorrect downcasting example
        Vehicle vehicle2 = new Vehicle();
        Car car2 = (Car) vehicle2; // Runtime ClassCastException

        double x = 6.9;
        int y = (int) x;
        System.out.println(x);
        System.out.println(y);

    }
}
