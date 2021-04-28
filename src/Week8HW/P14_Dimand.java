package Week8HW;

import java.util.Scanner;

public class P14_Dimand {
    int i = 0,
            j = 1,
            r = 0;

    public void shape() {

        System.out.println("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        while (i <= r) {
            j = 1;
            while (j <= r - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
        i = r - 1;

        while (i >= 1) {
            j = 1;
            while (j <= r - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }
    }

        public static void main (String[]args)
        {
            P14_Dimand obj = new P14_Dimand();
            obj.shape();
        }


    }
