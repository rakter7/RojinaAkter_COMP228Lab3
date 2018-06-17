package Exercise2;
import javax.swing.JOptionPane;

public class StudentTest {
    public static void main(String[] args) {

        Student[] students = new Student[2];
        students[0] = new FullTimeStudent("Nusrat", true, 0);
        students[1] = new PartTimeStudent("Rahman", false, 30);

        for(Student currentStudent: students){
            System.out.printf("%s%n%s%s%n", currentStudent.toString(), "Tuition Fee: ", currentStudent.tuitionFee() );
        }

    }
}
