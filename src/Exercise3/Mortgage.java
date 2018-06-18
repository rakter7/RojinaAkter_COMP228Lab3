package Exercise3;

import java.util.Random;

public abstract class Mortgage implements MortgageConstants{
    //variables
    public int mortgageNum;
    public String customerName;
    public double mortgageAmount;
    public double interest;
    public double term;

    //constructor
    public Mortgage() {
    }

    public Mortgage(int mortageNum, String customerName, double mortgageAmount,
                    double interest, double term) {

        if(mortgageAmount < 0 || mortgageAmount>300000) {
            throw new IllegalArgumentException("Please enter a valid amount above 0 and below 300000");}

        this.mortgageNum = mortageNum;
        this.customerName = customerName;
        this.mortgageAmount = mortgageAmount;
        if(interest > 0 && interest <= 3.0) {
            this.interest = interest;
        }
        this.interest = interest;
        this.term = term;
    }

    //getter and setter

    public void setMortgageNum(int mortgageNum) {
        this.mortgageNum = mortgageNum;
    }

    public final int getMortgageNum() {
        return mortgageNum;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getMortgageAmount() {
        return mortgageAmount;
    }
    public void setMortgageAmount(double mortgageAmount) {
        if(mortgageAmount < 0 || mortgageAmount>maxLimit) {
            throw new IllegalArgumentException("Please enter a valid amount above 0 and below 300000");}

            this.mortgageAmount = mortgageAmount;
        }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        if(interest > 0 && interest <= 3.0) {
            this.interest = interest;
        }
    }

    public double getTerm() {
        return term;
    }

    public double setTerm(double term) {
        if(term<=1 || term>5){
            return term = shortTerm;
        }
        else
            return
        this.term = term;
    }

    //abstract method
    public abstract double mortgageInstallment() ;

    public String getMortgageInfo(){
        return toString();
    }

    @Override
    public String toString() {
        return String.format("%s%s %n%s%s %n%s$%.2f %n%s$%.2f %n%s%s","Mortage Number: " , mortgageNum , "Customer Name: " , customerName,
                "Mortgage Amount: ", mortgageAmount, "Prime Rate: ", interest, "Term: ", term);
    }
}

