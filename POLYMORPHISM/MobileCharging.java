class Mobile {
    String brand;
    double battery;

    public Mobile(String brand) {
        this.brand = brand;
        this.battery = 0.0;
    }

    void charge() {
        battery += 10.0;
        if (battery > 100.0) battery = 100.0;
    }

    double getBatteryStatus() {
        return battery;
    }

    void specialFeature() {
        System.out.println(brand + " has no special charging feature");
    }
}

class Smartphone extends Mobile {
    int power;

    public Smartphone(String brand, int power) {
        super(brand);
        this.power = power;
    }

    void charge() {
        battery += (10.0 + power * 0.5);
        if (battery > 100.0) battery = 100.0;
    }

    double getBatteryStatus() {
        return battery;
    }

    void specialFeature() {
        System.out.println(brand + " fast charging at " + power + " watts");
    }
}

class FeaturePhone extends Mobile {
    boolean plug;

    public FeaturePhone(String brand, boolean plug) {
        super(brand);
        this.plug = plug;
    }

    void charge() {
        if (plug) {
            battery += 5.0;
            if (battery > 100.0) battery = 100.0;
        }
    }

    double getBatteryStatus() {
        return battery;
    }
}

public class MobileCharging {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[2];
        mobiles[0] = new Smartphone("Samsung", 25);
        mobiles[1] = new FeaturePhone("Nokia", true);

        for (int i = 0; i < mobiles.length; i++) {
            mobiles[i].charge();
            System.out.println(mobiles[i].brand + " battery at " + mobiles[i].getBatteryStatus() + "%");
            if (mobiles[i] instanceof Smartphone) {
                ((Smartphone) mobiles[i]).specialFeature();
            } else {
                mobiles[i].specialFeature();
            }
            System.out.println("------------------------");
        }
    }
}
