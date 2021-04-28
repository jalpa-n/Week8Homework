package Week8HW;

import java.util.Scanner;

public class P9_FibonacciNumber {

    public static void fibonacci(int number) {

        int previousNumber = 0, firstNumber = 1, sum;

        for (int i = 0; i < number; i++) {
            System.out.print(previousNumber + "");
            sum = previousNumber + firstNumber;
            previousNumber = firstNumber;
            firstNumber = sum;
        }
    }

    //Main Method

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the value of number you want Fibonacci series: " + "\t");
        int number = num.nextInt();
        System.out.println("Fibonacci series+" + "\t");
        fibonacci(number);

    }
}
