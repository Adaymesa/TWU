/**
 * Created by adaymoises on 06/01/2017.
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        generatePrimeFactors(30);
    }

    static void generatePrimeFactors(int number) {

        for (int i = 2; i <= (number); i++) {
            while (number % i == 0) {
                number /= i;
                System.out.println(i);
            }
        }
    }


}


