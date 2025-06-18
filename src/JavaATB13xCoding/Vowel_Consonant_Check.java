package JavaATB13xCoding;

import java.util.Scanner;

public class Vowel_Consonant_Check {
    public static void main(String[] args) {
            // Taking character input from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the character");
            char ch = scanner.next().toLowerCase().charAt(0);

            //Check if input is an alphabet
            if(ch >= 'a' && ch <= 'z'){
                //Checking for vowel or consonant
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a vowel");
                }else {
                    System.out.println(ch + " is a consonant");
                }
            }else{
                System.out.println("Please enter a valid character");
            }

            scanner.close();

        }
}

