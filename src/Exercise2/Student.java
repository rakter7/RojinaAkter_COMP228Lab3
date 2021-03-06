package Exercise2;

public abstract class Student {
    private String studentName;
    private boolean studentStatus;
    private String studentType;

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
        if(studentType.equals("true"))
        {
            System.out.println("Full Time Student");
            return studentStatus;
        }
        if(studentType.equals("false"))
        {
            System.out.println("Part Time Student");
            return studentStatus;
        }
        return studentStatus;
    }
    public abstract double tuitionFee();
    @Override
    public String toString() {
        return String.format("Student Name: %s%n%s%s", getStudentName(), "Student Status: ", studentStatus);
            }
}
