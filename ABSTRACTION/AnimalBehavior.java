interface Animal {
    void eat();
    double food();

    default void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog implements Animal {
    String name;
    double food;

    public Dog(String name) {
        this.name = name;
        this.food = 0.0;
    }

    public void eat() {
        food += 2.5;
    }

    public double food() {
        return food;
    }
}

class Bird implements Animal {
    String name;
    double food;

    public Bird(String name) {
        this.name = name;
        this.food = 0.0;
    }

    public void eat() {
        food += 0.5;
    }

    public double food() {
        return food;
    }
}

public class AnimalBehavior {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Satya");
        animals[1] = new Bird("Sai");

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            System.out.println("Animal " + i + " food: " + animals[i].food());
            animals[i].sleep();
            System.out.println("------------------------");
        }
    }
}
