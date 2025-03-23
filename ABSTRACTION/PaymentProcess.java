interface Pay {
    void process(double amount);
    double total();
}

class Card implements Pay {
    String name;
    double sum;

    public Card(String name) {
        this.name = name;
        this.sum = 0.0;
    }

    public void process(double amount) {
        sum += amount * 1.05;
    }

    public double total() {
        return sum;
    }
}

class Wallet implements Pay {
    String name;
    double cash;

    public Wallet(String name) {
        this.name = name;
        this.cash = 0.0;
    }

    public void process(double amount) {
        cash += amount;
    }

    public double total() {
        return cash;
    }
}

public class PaymentProcess {
    public static void main(String[] args) {
        Pay[] payments = new Pay[2];
        payments[0] = new Card("Satya");
        payments[1] = new Wallet("Sai");

        for (int i = 0; i < payments.length; i++) {
            payments[i].process(100.0);
            System.out.println("Payment " + i + " total: $" + payments[i].total());
            System.out.println("------------------------");
        }
    }
}
