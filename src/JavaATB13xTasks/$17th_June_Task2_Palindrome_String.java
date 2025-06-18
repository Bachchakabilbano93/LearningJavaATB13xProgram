package JavaATB13xTasks;

import java.util.Scanner;

public class $17th_June_Task2_Palindrome_String {
    public static void main(String[] args) {
        // Problem: Palindrome of String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.nextLine();
        String originalInput = input.toLowerCase();

        String reverseOutput = "";
        int length = originalInput.length();

        for(int i = length -1; i >= 0; i--) {
            reverseOutput = reverseOutput + originalInput.charAt(i);
        }

        if(reverseOutput.equals(originalInput)){
            System.out.println("The input String is palindrome " + reverseOutput);
        }
        else{
            System.out.println("The input String is not palindrome " + input);
        }

        scanner.close();

    }

}
