package Exercise1;

public class Health extends Insurance {
private String healthType;

    public Health(String typeOfInsurance, double monthlyCost, String healthType){
        super (typeOfInsurance, monthlyCost);

    }


    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        if(healthType==""){
            throw new IllegalArgumentException("Please give the health insurance type");
        }
        this.healthType = healthType;
    }
    @Override
    public double setInsuranceCost() {
        if(healthType.toLowerCase()=="Dental"){
            return 500;
        }
        if(healthType.toLowerCase()=="Eye"){
            return 250;
        }
        if(healthType.toLowerCase()=="Other"){
            return 700;
        }
        if(healthType.toLowerCase()=="All"){
            return 1000;
        }
        else
            return 0;
    }
    public String displayInfo(){return String.format("%s %s%n%s %s", "Health Insurance: ", super.toString(), "Insurance for: ",healthType);}
}
