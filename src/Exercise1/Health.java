package Exercise1;

public class Health extends Insurance {
    private String healthType;

    public Health(String typeOfInsurance, double monthlyCost, String healthType) {
        super(typeOfInsurance, monthlyCost);
        this.healthType = healthType;

    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType;
    }

    @Override
    public double setInsuranceCost() {
        return getMonthlyCost();
    }

    @Override
    public String displayInfo() {
        if (healthType.equals("Dental")) {
            return "Dental Insurance Coverage for $2000 per annum";
        }
        if (healthType.equals("Eye")) {
            return "Eye Insurance Coverage for $1000 per annum";
        }
        if (healthType.equals("Other") ) {
            return "Other Insurance Coverage for $1000 per annum";
        }
        if (healthType.equals("All")) {
            return "All Insurance Coverage for $2000 per annum";
        } else
            return "";
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s %n%s %s%n%s%s",
                "This is Health Insurance ", super.toString(),
                "Health coverage Type: ", getHealthType(), "Insurance details: ", displayInfo());
    }
}
