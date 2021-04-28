package Week8HW;
/*
8. Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@
*/

import java.util.Scanner;

public class P8_RightTriangle {

    public void rightTriangle(int number) {

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    //Main Method

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the Value for no.of row =" + "\t");
        int number = num.nextInt();
        P8_RightTriangle triangle = new P8_RightTriangle();
        triangle.rightTriangle(number);
    }
}
