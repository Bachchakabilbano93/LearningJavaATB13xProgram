package JavaATB13xTasks;

import java.util.Scanner;

public class $24th_June_Task3_Leap_Year_Check {
    public static void main(String[] args) {
//        Check if a Year is a Leap Year.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        if(year%4 == 0){
            System.out.println(year + " is a leap year");
        } else if (year%400 == 0 && year%100 != 0) {
            System.out.println(year + " is a leap year");
        } else{
            System.out.println(year + " is not a leap year");
        }

        scanner.close();
    }
}
