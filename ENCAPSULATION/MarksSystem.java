class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

public class MarksSystem {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Satya", 85);
        students[1] = new Student("Sai", 90);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " marks: " + students[i].getMarks());
            students[i].setMarks(students[i].getMarks() + 5);
            System.out.println("Updated " + students[i].getName() + " marks: " + students[i].getMarks());
        }
    }
}
