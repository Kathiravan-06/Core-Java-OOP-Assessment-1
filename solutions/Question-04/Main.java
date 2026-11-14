import java.util.*;
class Vehicle {
    double dailyRate;
    Vehicle(double rate) {
        dailyRate = rate;
    }
    double calculateRentalCharge(int days) {
        return dailyRate * days;
    }
    String getVehicleType() {
        return "Vehicle";
    }
}
class Car extends Vehicle {
    Car() {
        super(1500.0);
    }
    String getVehicleType() {
        return "Car";
    }
}
class Bike extends Vehicle {
    Bike() {
        super(600.0);
    }
    String getVehicleType() {
        return "Bike";
    }
}
class Truck extends Vehicle {
    Truck() {
        super(3000.0);
    }
    String getVehicleType() {
        return "Truck";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int days = sc.nextInt();
        Vehicle vehicle;
        switch (type) {
            case 1:
                vehicle = new Car();
                break;
            case 2:
                vehicle = new Bike();
                break;
            default:
                vehicle = new Truck();
        }
        System.out.println("Vehicle Type: " + vehicle.getVehicleType());
        System.out.printf(Locale.US, "Rental Charge: %.2f%n",vehicle.calculateRentalCharge(days));
    }
}
