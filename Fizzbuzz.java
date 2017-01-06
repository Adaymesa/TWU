/**
 * Created by adaymoises on 06/01/2017.
 */
public class Fizzbuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz(){
        for (int count = 0; count <= 100; count++) {
            if (count % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (count % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (count % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(count);
            }
        }

    }
}
