package Week8HW;
/*
1. Read 10 numbers from the console entered by the user and print the sum of those  numbers.
        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
       -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read  10 numbers.
       -Use the nextInt() method to get the number and add it to the sum.
        -Before the user enters each number, print the message Enter number #x: where x represents the  count, i.e. 1, 2, 3, 4, etc.
        -For example, the first message printed to the user would be Enter number #1:, the next Enter number  #2:, and so on.
        Hint:
        -Use a while loop.
        -Use a counter variable for counting valid numbers.
        -Close the scanner after you don't need it anymore.
        -Create a class with the name ReadingUserInputChallenge.
        */

        import java.util.*;

public class P1_ReadingUserInputChallenge {
    double arr[] = new double[10];
    public boolean hasNextInt() {
        double counter;
        Scanner num = new Scanner(System.in);
        boolean result = true;
        int i = 0;
    while (i < 10) {
        System.out.println("Enter the number");
        counter = num.nextDouble();
        if (counter % 1 != 0) {
            result = false;
            System.out.println("Invalid number");
        do {
            System.out.println("Enter the correct number: ");
            counter = num.nextDouble();
        } while (counter % 1 != 0);
    }
                arr[i] = counter;
                i++;
            }
            num.close();
            return result;
        }
        public void nextInt() {
            double sum = 0;
            for (int a = 0; a < 10; a++) ;
        }

   //Main Method
    public static void main(String[] args) {
    P1_ReadingUserInputChallenge obj = new P1_ReadingUserInputChallenge();
        System.out.println(obj.hasNextInt());
        obj.nextInt();
    }
}

