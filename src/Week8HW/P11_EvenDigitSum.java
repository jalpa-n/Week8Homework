package Week8HW;
/*
11. Even Digit Sum
        Write a method named getEvenDigitSum with one parameter of type int called number.  The method should return the sum of the even digits within the number.
        If the number is negative, the method should return -1 to indicate an invalid value.  EXAMPLE INPUT/OUTPUT:
        * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
        * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
        * getEvenDigitSum(-22); → should return -1 since the number is negative
        NOTE: The method getEvenDigitSum should be defined as public static
*/

import java.util.Scanner;

public class P11_EvenDigitSum {
    //  Static method
    public static int getEvenDigitSum(int number) {

        int sum = 0, temp, n = 0, i = 0;

        if (number >= 0) {

            //Logic for sum of Evennumbers
            temp = number;

            while (temp > 0) {
                temp = temp / 10;
                n = n + 1;
            }

            int digit[] = new int[n];
            temp = number;

            while (temp > 0) {
                digit[i] = temp % 10;

                if (digit[i] % 2 == 0) {
                    sum = sum + digit[i];
                }
                temp = temp / 10;
                i++;
            }

            return sum;

        } else {

            return -1;
        }

    }

    //Main method
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number for the sum : " + "\t");
        int number = num.nextInt();
        if (number >= 0) {
            System.out.println("Sum of Even digit = " + "\t" + getEvenDigitSum(number));
        } else {
            System.out.println(getEvenDigitSum(number));
        }
    }
}
