package Exercise3;
import java.util.Random;
import java.util.Scanner;

public class ProcessMortgage {


    public static void main(String[] args) {

        PersonalMortgage personalMortgage = new PersonalMortgage();
        BusinessMortgage businessMortgage = new BusinessMortgage();

        Mortgage[] mortgages = new Mortgage[2];

        mortgages[0] = personalMortgage;
        mortgages[1] = businessMortgage;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the mortgage type: Personal Mortgage - 1 or Business Mortgage - 2: ");
        int choice = Integer.parseInt(input.nextLine());

        if (choice == 1) {
            System.out.println("Please enter the prime rate: ");
            double interest = Double.parseDouble(input.nextLine());
            personalMortgage.setInterest(interest);

            System.out.println("Please enter the Term: ");
            double mortgageTerm;
            mortgageTerm = Double.parseDouble(input.nextLine());
            personalMortgage.setTerm(mortgageTerm);

            System.out.println("Mortgage Amount: ");
            double mortgageAmount;
            mortgageAmount = Double.parseDouble(input.nextLine());
            personalMortgage.setMortgageAmount(mortgageAmount);

            System.out.println("Customer Name: ");
            String customerName = input.nextLine();
            personalMortgage.setCustomerName(customerName);

            System.out.println("Mortgage Fee: ");
            double mortgageFee;
            mortgageFee = Double.parseDouble(input.nextLine());
            personalMortgage.setMortgageFee(mortgageFee);
        }
        if (choice == 2) {
            //Business Mortgage
            System.out.println("Please enter the prime rate: ");
            double interest1 = Double.parseDouble(input.nextLine());
            businessMortgage.setInterest(interest1);

            System.out.println("Please enter the Term: ");
            double mortgageTerm1;
            mortgageTerm1 = Double.parseDouble(input.nextLine());
            businessMortgage.setTerm(mortgageTerm1);
            System.out.println("Mortgage Amount: ");
            double mortgageAmount1;
            mortgageAmount1 = Double.parseDouble(input.nextLine());
            businessMortgage.setMortgageAmount(mortgageAmount1);
            System.out.println("Customer Name: ");
            String customerName1 = input.nextLine();
            businessMortgage.setCustomerName(customerName1);
            System.out.println("Mortgage Insurance: ");
            double mortgageInsurance;
            mortgageInsurance = Double.parseDouble(input.nextLine());
            businessMortgage.setBusinessInsurance(mortgageInsurance);

            System.out.println();
        }

        System.out.println();
        for (Mortgage currentMortgage : mortgages)

        {
            System.out.println(currentMortgage);
            System.out.println();
        }
    }
}