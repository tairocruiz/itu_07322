
import student.Student;

public class GraduateStudent extends Student{
    String thesisTitle;

    public GraduateStudent(int studentId, String name, String address, String thesisTitle) {
        super(studentId, name, address);
        this.thesisTitle = thesisTitle;
    }

    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
