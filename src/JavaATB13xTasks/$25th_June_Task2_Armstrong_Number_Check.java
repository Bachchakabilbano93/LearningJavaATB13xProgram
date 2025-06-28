package JavaATB13xTasks;

import java.util.Scanner;

public class $25th_June_Task2_Armstrong_Number_Check {
    public static void main(String[] args) {
//        Check if a Number is an Armstrong Number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        boolean isArmstrong = checkArmstrong(number);

        if(isArmstrong){
            System.out.println(number + " is an Armstrong Number");
        }else {
            System.out.println(number + " is not an Armstrong Number");
        }

        scanner.close();
    }

    static boolean checkArmstrong(int num) {
        int originalNumber = num;
        int digitCount = 0;
        int sum = 0;

        // Step 1: Count the number of digits
        int temp = num;
        while (temp > 0) {
            digitCount++;
            temp = temp / 10;
        }

        // Step 2: Calculate sum of each digit raised to power of digit count
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;              // Extract last digit
            int power = calculatePower(digit, digitCount);  // Calculate digit^digitCount
            sum = sum + power;                  // Add to sum
            temp = temp / 10;                   // Remove last digit
        }

        // Step 3: Compare sum with original number
        if (sum == originalNumber) {
            return true;
        } else {
            return false;
        }
    }

    static int calculatePower(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

}

