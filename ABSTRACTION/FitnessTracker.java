abstract class Tracker {
    String user;
    double steps;

    public Tracker(String user) {
        this.user = user;
        this.steps = 0.0;
    }

    abstract void track();

    double getSteps() {
        return steps;
    }

    void reset() {
        steps = 0.0;
    }
}

class Runner extends Tracker {
    int pace;

    public Runner(String user, int pace) {
        super(user);
        this.pace = pace;
    }

    void track() {
        steps += 100 * pace;
    }
}

class Walker extends Tracker {
    boolean active;

    public Walker(String user, boolean active) {
        super(user);
        this.active = active;
    }

    void track() {
        if (active) {
            steps += 50;
        } else {
            steps += 0;
        }
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        Tracker[] trackers = new Tracker[2];
        trackers[0] = new Runner("Satya", 2);
        trackers[1] = new Walker("Sai", true);

        for (int i = 0; i < trackers.length; i++) {
            trackers[i].track();
            System.out.println(trackers[i].user + " steps: " + trackers[i].getSteps());
            trackers[i].reset();
            System.out.println(trackers[i].user + " after reset: " + trackers[i].getSteps());
            System.out.println("------------------------");
        }
    }
}
