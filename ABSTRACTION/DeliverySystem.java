interface Delivery {
    void ship();
    double cost();

    default void status() {
        System.out.println("In transit");
    }
}

class Express implements Delivery {
    String name;
    double fee;

    public Express(String name) {
        this.name = name;
        this.fee = 0.0;
    }

    public void ship() {
        fee += 15.0;
    }

    public double cost() {
        return fee;
    }
}

class Standard implements Delivery {
    String name;
    double charge;

    public Standard(String name) {
        this.name = name;
        this.charge = 0.0;
    }

    public void ship() {
        charge += 5.0;
    }

    public double cost() {
        return charge;
    }
}

public class DeliverySystem {
    public static void main(String[] args) {
        Delivery[] orders = new Delivery[2];
        orders[0] = new Express("Satya");
        orders[1] = new Standard("Sai");

        for (int i = 0; i < orders.length; i++) {
            orders[i].ship();
            System.out.println("Order " + i + " cost: $" + orders[i].cost());
            orders[i].status();
            System.out.println("------------------------");
        }
    }
}
