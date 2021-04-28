package Week8HW;
/*
12. Write a programme to input any number and check if it is prime or not.
        (Prime number is a number that is greater than 1 and divided by 1 or itself only.
         In other words,  prime numbers can't be divided by other numbers than itself or 1.
          For example 2, 3, 5, 7, 11, 13,  17.... are the prime numbers.)
*/
import java.util.Scanner;

public class P12_PrimeOrNot {

    public void primeNumber(int number) {

        boolean result = false;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                result = false;
                break;

            } else {
                result = true;
            }

        }

        if (number == 1 || number == 2) {
            System.out.println("Given number" + "\t" + number + "\t" + "Is Prime number");

        } else if (result == false) {

            System.out.println("Given number " + "\t" + number + "\t" + "Is Not Prime number");

        } else {

            System.out.println("Given number " + "\t" + number + "\t" + "Is Prime Number");

        }
    }
//Main method
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number:" + "\t");
        int number = num.nextInt();
        P12_PrimeOrNot prime = new P12_PrimeOrNot();
        prime.primeNumber(number);

    }
}
