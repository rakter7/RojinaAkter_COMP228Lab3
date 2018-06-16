package Exercise1;

public class InsuranceTest {
    public static void main(String[] args) {

        //Health health = new Health("Health Insurance 1", 100, "Dental");
        //Insurance client1= health;
        //client1.setInsuranceCost();

        //System.out.printf("%s",client1);

        Life life = new Life("LIFE INSURANCE", 5000, 38);
        Insurance client2 = life;
        client2.setInsuranceCost();

        System.out.println();

        System.out.printf("%s", client2.displayInfo());
        }
}
