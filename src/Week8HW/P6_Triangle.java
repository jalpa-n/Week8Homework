package Week8HW;
/*
6. Write a program in Java to display the pattern like a triangle with a number.   For eg.
        Input number of rows: 10
        Expected Output:
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
*/

import java.util.Scanner;

public class P6_Triangle {
    public void P6_Triangle(int input) {
        //Logic for Triangle
        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
// Main Method
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);    //create object
        System.out.println("Enter the value for no. of row : ");
        int input = num.nextInt();
        P6_Triangle tri = new P6_Triangle();//create object
        tri.P6_Triangle(input);//call triangle method in main mrthod via Object
    }


}