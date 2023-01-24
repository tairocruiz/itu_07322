package student;

public class Student {
    int studentId;
    String name;
    String address;

    public Student(int studentId, String name, String address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

