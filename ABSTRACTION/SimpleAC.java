abstract class AC {
    String unit;
    double temp;

    public AC(String unit) {
        this.unit = unit;
        this.temp = 25.0;
    }

    abstract void cool();

    double getTemp() {
        return temp;
    }
}

class BasicAC extends AC {
    public BasicAC(String unit) {
        super(unit);
    }

    void cool() {
        temp -= 1.0;
    }
}

class SmartAC extends AC {
    public SmartAC(String unit) {
        super(unit);
    }

    void cool() {
        temp -= 2.0;
    }
}

public class SimpleAC {
    public static void main(String[] args) {
        AC[] units = new AC[2];
        units[0] = new BasicAC("Satya");
        units[1] = new SmartAC("Sai");

        for (int i = 0; i < units.length; i++) {
            units[i].cool();
            System.out.println(units[i].unit + " temp: " + units[i].getTemp());
        }
    }
}
