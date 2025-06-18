package JavaATB13xTasks;

import java.util.Scanner;

public class $17th_June_Task1_Vowel_Consonant_Count {
    public static void main(String[] args) {
        //    Problem: Count vowels and consonants in a String
        Scanner scanner = new Scanner(System.in);
        String input;

        while(true){
            System.out.println("Enter the String");
            input = scanner.nextLine();

            // Check if input contains only alphabetic characters
            boolean isValid = true;
            for(int i=0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
                    isValid = false;
                    break;
                }
            }

            if(!isValid || input.length() == 0) {
                System.out.println("Invalid input. Please enter a string containing only alphabetic characters");
                continue;
            }
            break;
        }

        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Count only first occurrence of each character
            if(input.indexOf(ch) == i) {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        scanner.close();

        System.out.println("vowels: " + vowels + ", consonants: " + consonants);

    }

}
