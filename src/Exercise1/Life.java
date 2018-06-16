package Exercise1;

public class Life extends Insurance{

private double age;

    public Life(String typeOfInsurance, double monthlyCost, double age) {
     super(typeOfInsurance, monthlyCost);
     //checking
        if(age < 0.0 || age>=100) {
            throw new IllegalArgumentException("Age limit for insurance is 0-100 years.");
        }

    }
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if(age < 0.0 || age>=100) {
            throw new IllegalArgumentException("Age limit for insurance is 0-99 years.");
        }
        this.age = age;
    }


    @Override
    public double setInsuranceCost() {
        if(age>0 || age<25){
            return (getMonthlyCost()/ 100);
        }
        if(age>=25 || age<50){
            return (getMonthlyCost()/ 150);
        }
        if(age>=50 || age<70){
            return (getMonthlyCost()/ 200);
        }
        if(age>=70 || age<100){
            return (getMonthlyCost()/ 250);
        }
        else
        return 0;
    }
@Override
    public String displayInfo(){
        return String.format("%s %n%s: %s", super.toString(), "Age: ", getAge());}
}
