package Exercise1;

public class InsuranceTest {
    public static void main(String[] args) {

        Life life = new Life("Life", 200, 45);
        Health health = new Health("Health", 300, "Dental");

        Insurance[] insurances = new Insurance[2];

        insurances[0] = life;
        insurances[1] = health;

        System.out.println();
        for (Insurance currentInsurance : insurances)

        {
            System.out.println();
            System.out.println(currentInsurance);
            System.out.printf("Insurance premium: $%.2f%n", currentInsurance.setInsuranceCost());

        }
    }
}
