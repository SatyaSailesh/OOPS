class Student {
    String name;
    boolean allow;

    public Student(String name) {
        this.name = name;
        this.allow = false;
    }

    void check() {
        allow = false;
    }

    boolean canEnter() {
        return allow;
    }

    void info() {
        System.out.println(name + " has no special status");
    }
}

class CollegeStudent extends Student {
    boolean id;

    public CollegeStudent(String name, boolean id) {
        super(name);
        this.id = id;
    }

    void check() {
        allow = id;
    }

    boolean canEnter() {
        return allow;
    }

    void info() {
        System.out.println(name + " has ID card: " + id);
    }
}

class GuestStudent extends Student {
    boolean pass;

    public GuestStudent(String name, boolean pass) {
        super(name);
        this.pass = pass;
    }

    void check() {
        allow = pass;
    }

    boolean canEnter() {
        return allow;
    }
}

public class EntrySystem {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new CollegeStudent("Satya", true);
        students[1] = new GuestStudent("Sai", false);

        for (int i = 0; i < students.length; i++) {
            students[i].check();
            System.out.println(students[i].name + " can enter: " + students[i].canEnter());
            if (students[i] instanceof CollegeStudent) {
                ((CollegeStudent) students[i]).info();
            } else {
                students[i].info();
            }
            System.out.println("------------------------");
        }
    }
}
