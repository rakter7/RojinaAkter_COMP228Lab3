package Exercise3;

public class BusinessMortgage extends Mortgage {
    public double businessInsurance;

    public double getBusinessInsurance() {
        return businessInsurance;
    }

    public void setBusinessInsurance(double businessInsurance) {
        if(businessInsurance > 0 ) {
            this.businessInsurance = businessInsurance;
        }
    }

    //constructor
    public BusinessMortgage(){

    }
    public BusinessMortgage(int mortageNum, String customerName,
                            double mortgageAmount, double interestRate, double term, double businessInsurance) {

        super(mortageNum, customerName, mortgageAmount, interestRate, term);
        this.businessInsurance = businessInsurance;
    }
    public String getMortgageInfo(){
        return (bankName+ "\nThis is the Business mortgage where you can get mortgage amount for your Business need..\n");
    }
    @Override
    public double mortgageInstallment() {
        return (((mortgageAmount+ (mortgageAmount * (interest+2)/100)) /(term*12)) + businessInsurance/(term*12));
    }

    @Override
    public String toString() {
        return String.format("%s%s %n%s: %.2f %n%s%.2f ", getMortgageInfo(), super.toString(), "Business Insurance: ", getBusinessInsurance(), "Mortgage Installment: ", mortgageInstallment() );

    }
}
