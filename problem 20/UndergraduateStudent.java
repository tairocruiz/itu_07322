import student.Student;

public class UndergraduateStudent extends Student {
    String major;

    public UndergraduateStudent(int studentId, String name, String address, String major) {
        super(studentId, name, address);
        this.major = major;
    }

    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Major: " + major);
    }
}