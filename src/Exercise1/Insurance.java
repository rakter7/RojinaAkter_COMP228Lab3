package Exercise1;

public abstract class Insurance {
    private final String insuranceType;
    private Double monthlyCost;

    public Insurance(String insuranceType, Double monthlyCost) {
        this.insuranceType = insuranceType;
        this.monthlyCost = monthlyCost;

        // Check if gross sales is 0.0 or higher
        if (monthlyCost < 0.0 || monthlyCost > 500) {
            throw new IllegalArgumentException("Monthly cost must be greater than $0.00 and less than $500.00");
        }
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(double monthlyCost) {
        if (monthlyCost < 0.0 || monthlyCost > 500) {
            throw new IllegalArgumentException("Monthly cost must be greater than $0.00 and less than $500.00");
        }
        this.monthlyCost = monthlyCost;
    }
    //abstract method
    public abstract double setInsuranceCost();

    public abstract String displayInfo();

    @Override
    public String toString() {
        return String.format("%s: %s %n%s %.2f",
                "Insurance Type: ", insuranceType,
                "Monthly Cost: ", monthlyCost);


    }
}
