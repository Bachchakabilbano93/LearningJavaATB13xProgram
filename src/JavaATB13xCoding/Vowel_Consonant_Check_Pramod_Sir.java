package JavaATB13xCoding;

import java.util.Scanner;

public class Vowel_Consonant_Check_Pramod_Sir {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
//         #### To check if a character is a vowel in Java
// ch == aieou ->

// -  User will enter a character.
// -  You will check by using if-else loop and give that if the character is a vowel or a consonant.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single char");
        char ch = scanner.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch== 'u'){
            System.out.println(ch +" is vowel!");
        }else if(ch >='a' && ch<='z'){
            System.out.println(ch +" is consonant");
        }
        else{
            System.out.println("Invalid Char!");
        }
    }
}
