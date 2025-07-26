package JavaATB13xTasks;

import java.util.Scanner;

public class $18th_June_Task1_Leap_Year_Checker {
    public static void main(String[] args) {
//        Problem: Leap Year Checker:

//        Create a program that determines whether a given year is a leap year.
//        A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
//        Use an if-else statement to make this determination.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        if(year%4 == 0){
            System.out.println(year + " is a leap year");
        } else if (year%400 == 0 && year%100 != 0){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }

        scanner.close();

    }
}
