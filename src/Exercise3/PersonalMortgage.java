package Exercise3;

public class PersonalMortgage extends Mortgage {
    public double mortgageFee;

    public double getMortgageFee() {
        return mortgageFee;
    }

    public void setMortgageFee(double mortgageFee) {
        if(mortgageFee > 0 ) {
            this.mortgageFee = mortgageFee;
        }
    }

    //constructor
    public PersonalMortgage(){

    }
    public PersonalMortgage(int mortageNum, String customerName,
                            double mortgageAmount, double interestRate, double term, double mortgageFee) {

        super(mortageNum, customerName, mortgageAmount, interestRate, term);
        this.mortgageFee=mortgageFee;
    }

    @Override
    public double mortgageInstallment() {
        return (((mortgageAmount+ (mortgageAmount * (interest+1)/100)) /(term*12)) + mortgageFee/(term*12));
    }
    @Override
public String getMortgageInfo(){
        return (bankName+ "\nThis is the personal mortgage where you can get mortgage amount for your personal need..\n");
}
    @Override
    public String toString() {
        return String.format("%s%n%s %n%s: %.2f %n%s%.2f ", getMortgageInfo(), super.toString(), "Mortgage Fee: ", getMortgageFee(), "Mortgage Installment: ", mortgageInstallment() );

    }
}
