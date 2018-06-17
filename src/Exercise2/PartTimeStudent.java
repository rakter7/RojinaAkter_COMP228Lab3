package Exercise2;

public class PartTimeStudent extends Student{
    private double creditHour;

   public PartTimeStudent(String studentName, boolean studentStatus, double creditHour) {
        super(studentName, studentStatus=false);
        this.creditHour=creditHour;
    }

    public double getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(double creditHour) {
       if(creditHour<3.0 || creditHour>35){
           throw new IllegalArgumentException("Credit hours for part-time student must be greater than 3 and less than 35");
       }
        this.creditHour = creditHour;
    }

    @Override
    public double tuitionFee()
    {
        return getCreditHour()*100;
    }
    @Override
    public String toString() {
        return String.format("Part Time Student: %n%s%n%s%.2f", super.toString(),"Total credit Hour: ", getCreditHour());
    }
}
