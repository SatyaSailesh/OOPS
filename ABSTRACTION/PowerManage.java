abstract class Device {
    String name;
    double power;

    public Device(String name) {
        this.name = name;
        this.power = 0.0;
    }

    abstract void start();

    void stop() {
        power = 0.0;
    }

    double getPower() {
        return power;
    }
}

class Fan extends Device {
    int speed;

    public Fan(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    void start() {
        power = 20 + speed * 5;
    }
}

class Lamp extends Device {
    boolean on;

    public Lamp(String name, boolean on) {
        super(name);
        this.on = on;
    }

    void start() {
        power = on ? 15 : 0;
    }
}

public class PowerManager {
    public static void main(String[] args) {
        Device[] devices = new Device[2];
        devices[0] = new Fan("Satya", 2);
        devices[1] = new Lamp("Sai", true);

        for (int i = 0; i < devices.length; i++) {
            devices[i].start();
            System.out.println(devices[i].name + " power: " + devices[i].getPower());
            devices[i].stop();
            System.out.println(devices[i].name + " after stop: " + devices[i].getPower());
            System.out.println("------------------------");
        }
    }
}
