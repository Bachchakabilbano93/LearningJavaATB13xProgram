package JavaATB13xTasks;

import java.util.Scanner;

public class $25th_June_Task1_Palindrome_Number_Check {
    public static void main(String[] args) {
//        Check if a Number is a Palindrome.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        boolean isPalindrome = checkPalindrome(number);

        if(isPalindrome){
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

        scanner.close();
    }

    static boolean checkPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while(num < 0){
            return false;
        }

        while(num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num / 10;
        }

        if(originalNumber == reversedNumber){
            return true;
        } else {
            return false;
        }

    }
}
