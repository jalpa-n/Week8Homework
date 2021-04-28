package Week8HW;
/*
15. Display left angle triangle of * using nested for loops
        *
        * *
        * * *
        * * * *
        * * * * *
*/

import java.util.Scanner;

public class P15_LeftTriangle {
int rows=5;

public void P15_LeftTriangle(int rows) {

        for (int x = 1; x <= rows; x++) {

            for (int i = 1; i <= x; i++) {
               System.out.print("* ");
            }

            System.out.println("");
        }

        System.out.println("");

    }

    public static void main(String[] args) {
        P15_LeftTriangle obj = new P15_LeftTriangle();
        obj.P15_LeftTriangle(obj.rows);
    }
}

