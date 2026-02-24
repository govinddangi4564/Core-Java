package Basic;

public class InterestCalculator {

    public static void main(String[] args) {

        // Given values
        double P = 10000;   // Principal
        double T = 2;       // Time in years
        double R = 5;       // Rate of interest

        // Simple Interest Formula
        double SI = (P * T * R) / 100;

        // Compound Interest Formula
        double amount = P * Math.pow((1 + R / 100), T);
        double CI = amount - P;

        System.out.println("Principal = " + P);
        System.out.println("Time = " + T);
        System.out.println("Rate = " + R);

        System.out.println("Simple Interest = " + SI);
        System.out.println("Compound Interest = " + CI);
    }
}
