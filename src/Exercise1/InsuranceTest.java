package Exercise1;

public class InsuranceTest {
    public static void main(String[] args) {

        Health health = new Health("Health Insurance 1", 100, "Dental");
        Insurance client1= health;
        client1.setInsuranceCost();

        Life life = new Life("LIFE INSURANCE", 150, 38, 1.5);
        Insurance client2 = life;
        client2.setInsuranceCost();

        System.out.printf("%s",client1);

        System.out.println();

        System.out.printf("%s", client2);
        }
}
