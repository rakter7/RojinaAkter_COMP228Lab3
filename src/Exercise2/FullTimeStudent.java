package Exercise2;

public class FullTimeStudent extends Student {
    private final double tuitionFee=2000;

    public FullTimeStudent(String studentName, boolean studentStatus, double tuitionFee) {
        super(studentName, studentStatus);
    }

    @Override
    public String toString() {
        return String.format("Full Time Student: %n%s%n", super.toString());
    }


    @Override
    public double tuitionFee()
    {
        return tuitionFee;
    }
}
