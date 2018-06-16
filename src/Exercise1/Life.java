package Exercise1;

public class Life extends Insurance{

private double age;
private double insuranceRate;

    public Life(String typeOfInsurance, double monthlyCost, double age, double insuranceRate) {
     super(typeOfInsurance, monthlyCost);
     //checking
        if(age < 0.0 || age<100) {
            throw new IllegalArgumentException("Age limit for insurance is 0-100 years.");
        }

        if(insuranceRate<0.0 ||insuranceRate>2.0){
            throw new IllegalArgumentException("Insurance rate must be greater than 0.0 or less than 2.0");
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

    public double getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
        if(insuranceRate<0.0 ||insuranceRate>2.0){
            throw new IllegalArgumentException("Insurance rate must be greater than 0.0 or less than 2.0");
        }
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double setInsuranceCost() {
        if(age>0.0 && age<25){
            return 100 * insuranceRate;
        }
        if(age>=25 && age<50){
            return 150 * insuranceRate;
        }
        if(age>=50 && age<70){
            return 200 * insuranceRate;
        }
        if(age>=70 && age<100){
            return 200 * insuranceRate;
        }
        else
        return 0;
    }

    public String displayInfo(){ return String.format("%s %s%n%s: %.2f", "Life Insurance: ", super.toString(), "Insurance Rate: ", insuranceRate);}
}
