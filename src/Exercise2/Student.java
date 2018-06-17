package Exercise2;

public abstract class Student {
    private String studentName;
    private boolean studentStatus;

    public Student(String studentName, boolean studentStatus){
        this.studentName= studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentStatus(boolean studentStatus) {
        this.studentStatus = studentStatus;
    }

    public boolean isStudentStatus() {
        return studentStatus;
    }
    public abstract double tuitionFee();
    @Override
    public String toString() {
        return String.format("Student Name: %s%n%s%s", getStudentName(), "Student Status: ", studentStatus);
            }
}
