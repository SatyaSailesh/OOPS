abstract class Vehicle {
    String name;
    double speed;

    public Vehicle(String name) {
        this.name = name;
        this.speed = 0.0;
    }

    abstract void move();

    double getSpeed() {
        return speed;
    }
}

class Bike extends Vehicle {
    int gear;

    public Bike(String name, int gear) {
        super(name);
        this.gear = gear;
    }

    void move() {
        speed += 10 + gear * 5;
    }
}

class Truck extends Vehicle {
    boolean load;

    public Truck(String name, boolean load) {
        super(name);
        this.load = load;
    }

    void move() {
        speed += load ? 20 : 30;
    }
}

public class SpeedControl {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Bike("Satya", 3);
        vehicles[1] = new Truck("Sai", true);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
            System.out.println(vehicles[i].name + " speed: " + vehicles[i].getSpeed());
            System.out.println("------------------------");
        }
    }
}
