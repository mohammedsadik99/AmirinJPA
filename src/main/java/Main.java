import com.example.Exam;
import com.example.Student;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        ExamDAO examDAO = new ExamDAO();

        Student john = new Student("John Doe");
        Student jane = new Student("Jane Smith");

        studentDAO.saveStudent(john);
        studentDAO.saveStudent(jane);

        Date currentDate = new Date();

        examDAO.saveExam(new Exam(john, 4, currentDate));
        examDAO.saveExam(new Exam(john, 5, currentDate));
        examDAO.saveExam(new Exam(jane, 3, currentDate));

        List<Student> students = studentDAO.getAllStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            student.getExams().forEach(exam ->
                    System.out.println(" - Exam Grade: " + exam.getGrade() + ", Saved On: " + exam.getGradeSavingDate())
            );
        }
    }
}
