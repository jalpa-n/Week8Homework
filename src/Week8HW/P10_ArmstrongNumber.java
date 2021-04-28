package Week8HW;
/*

10. Write a program to input any number and check if it Armstrong number or not
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153
*/

import java.util.Scanner;

// Instance method

public class P10_ArmstrongNumber {

    public void armstrong(int number) {
        int n = 0, temp, i = 0, sum = 0;
        temp = number;

        while (temp > 0) {
            temp = temp / 10;
            n = n + 1;
        }

        temp = number;
        int digit[] = new int[n];
        while (temp > 0) {
            digit[i] = temp % 10;

            sum = sum + (digit[i] * digit[i] * digit[i]);
            temp = temp / 10;
            i++;
        }

        if (number == sum) {
            System.out.println("Given number " + number + " is armstrong number");

        } else {
            System.out.println("Given number " + number + " is not armstrong number");
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = num.nextInt();
        P10_ArmstrongNumber obj = new P10_ArmstrongNumber();
        obj.armstrong(number);
    }
}


