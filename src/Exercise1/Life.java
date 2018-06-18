package Exercise1;

public class Life extends Insurance {

    private double age;

    public Life(String typeOfInsurance, double monthlyCost, double age) {
        //calling superclass constructor
        super(typeOfInsurance, monthlyCost);
        //checking
        if (age < 0.0 || age >= 100) {
            throw new IllegalArgumentException("Age limit for insurance is 0-100 years.");
        }
        this.age = age;

    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age < 0.0 || age >= 100) {
            throw new IllegalArgumentException("Age limit for insurance is 0-99 years.");
        }
        this.age = age;
    }

    @Override
    public double setInsuranceCost() {
        if ((getAge() > 0) && (getAge() < 25)) {
            return (getMonthlyCost() + 10);
        }
        if ((getAge() >= 25) && (getAge() < 50)) {
            return (getMonthlyCost() + 15);
        }
        if ((getAge() >= 50) && (getAge() < 70)) {
            return (getMonthlyCost() + 20);
        }
        if ((getAge() >= 70) && (getAge() < 100)) {
            return (getMonthlyCost() + 25);
        } else
            return 0;
    }

    @Override
    public String displayInfo() {
        if ((getAge() > 0) && (getAge() < 25)) {
            return "Beginner Insurance Coverage for $5000 per annum";
        }
        if ((getAge() >= 25) && (getAge() < 50)){
            return "Young-Age Insurance Coverage for $10000 per annum";
        }
        if ((getAge() >= 50) && (getAge() < 70)) {
            return "Mid-Age Insurance Coverage for $15000 per annum";
        }
        if ((getAge() >= 70) && (getAge() < 100)) {
            return "Adult Insurance Coverage for $20000 per annum";
        } else
            return "";
    }

    @Override
    public String toString() {
        return String.format("%n%s: %n%s %n%s %.2f%s %n%s%s",
                "This is Life Insurance ", super.toString(),
                "Age: ", getAge(), "Years old", "Insurance details: ", displayInfo());
    }
}
