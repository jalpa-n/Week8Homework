package Week8HW;
/*3. Write a Java program that takes the user to provide a single character from the   alphabet.
 Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter
 (between a and z or A and Z), or is a string of length > 1, print an  error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant*/

import java.util.Scanner;

public class P3_VowelOrConsonant {

    void Alphabet(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Alphabet is Vowel : ");

        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet is Consonant");

        } else {
            System.out.println("It is not Alphabet");
        }

    }
//Main Method
    public static void main(String[] args) {
        P3_VowelOrConsonant c = new P3_VowelOrConsonant();  //class name
        Scanner sc = new Scanner(System.in);   //scanner
        System.out.println("Enter alphabet");
        char in = sc.next().charAt(0);
        c.Alphabet(in);
    }
}