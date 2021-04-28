
package Week8HW;

/*
2. -Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
        -Before the user enters the number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
        Hint:
        -Use an endless while loop.
        -Create a class with the name MinAndMaxInputChallenge.
*/

import java.util.Scanner;

public class P2_MinAndMaxInputChallenge {
//instance method

    public void minmax() {
        int number;
        int i = 1, n = 0;
        int minnumber;
        int maxnumber = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        number = num.nextInt();
        minnumber = number;

        while (i > 0) {

            number = num.nextInt();

            if (number >= 0) {
                for (int j = 0; j < i; j++) {
                    if (number < minnumber) {
                        minnumber = number;
                    }
                }

                for (int j = 0; j < i; j++) {
                    if (number > maxnumber) {
                        maxnumber = number;
                    }
                }
                } else{

                    System.out.println("Invalid");
                    System.out.println("min"+ minnumber );
                    System.out.println("max"+ maxnumber);
                    System.out.println("total " + (i + 1));
                    break;
                }

                i++;
            }
        }

        //Main Method
    public static void main(String[] args) {
        P2_MinAndMaxInputChallenge obj = new P2_MinAndMaxInputChallenge();
        obj.minmax();

    }
}