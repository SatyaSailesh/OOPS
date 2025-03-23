class Vehicle {
    String brand;
    double speed;

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0.0;
    }

    void accelerate() {
        speed += 10;
    }

    double calculateFuelEfficiency() {
        return 25.0;
    }

    public void displaySpeed() {
        System.out.println(brand + " current speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int passengers;

    public Car(String brand, int passengers) {
        super(brand);
        this.passengers = passengers;
    }

    void accelerate() {
        speed += 20;
        if (speed > 200) speed = 200;
    }

    double calculateFuelEfficiency() {
        return 30.0 / (speed * 0.05);
    }

    public void specialFeature() {
        System.out.println("Car carrying " + passengers + " passengers");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }

    void accelerate() {
        speed += 30;
        if (speed > 250) speed = 250;
    }

    double calculateFuelEfficiency() {
        return hasSidecar ? 20.0 : 30.0;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota", 4);
        vehicles[1] = new Motorcycle("Honda", false);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].accelerate();
            vehicles[i].displaySpeed();
            System.out.println("Fuel Efficiency: " + vehicles[i].calculateFuelEfficiency());
            if (vehicles[i] instanceof Car) {
                ((Car) vehicles[i]).specialFeature();
            }
            System.out.println("------------------------");
        }
    }
}
