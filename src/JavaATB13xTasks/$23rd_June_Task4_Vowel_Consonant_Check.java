package JavaATB13xTasks;

import java.util.Scanner;

public class $23rd_June_Task4_Vowel_Consonant_Check {
    public static void main(String[] args) {
//        Check if a Character is a Vowel or Consonant.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch== 'u'){
            System.out.println(ch +" is vowel!");
        }else if(ch >='a' && ch<='z'){
            System.out.println(ch +" is consonant");
        }
        else{
            System.out.println("Invalid Char!");
        }

        scanner.close();

    }
}
