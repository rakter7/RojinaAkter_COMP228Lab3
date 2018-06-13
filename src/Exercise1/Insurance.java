package Exercise1;

public abstract class Insurance {
    private final String insuranceType;
    private final Double monthlyCost;

    public Insurance (String insuranceType, Double monthlyCost){
        this.insuranceType = insuranceType;
        this.monthlyCost= monthlyCost;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }

    public abstract double setInsuranceCost();
}
