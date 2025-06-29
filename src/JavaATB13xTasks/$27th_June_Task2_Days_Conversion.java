package JavaATB13xTasks;

import java.util.Scanner;

public class $27th_June_Task2_Days_Conversion {
    public static void main(String[] args) {
//        Convert Days into Years, Months, and Days.
//       :- Take the Days Input from the User
//        Define the conversion logic:
//        :- Assume 1 year = 365 days.
//        :- Assume 1 month = 30 days
//        :- Convert the Days into Years, Month and days and Print it.
//        if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Call method to convert and display result
        convertDays(totalDays);

        scanner.close();
    }

    public static void convertDays(int totalDays) {
        int yearLength = 365;
        int monthLength = 30;

        // Calculate years, months, and remaining days
        int years = totalDays / yearLength;
        int remainingDaysAfterYears = totalDays % yearLength;

        int months = remainingDaysAfterYears / monthLength;
        int days = remainingDaysAfterYears % monthLength;

        // Build output string with proper singular/plural forms
        String yearText = "";
        String monthText = "";
        String dayText = "";

        // Handle years
        if (years == 1) {
            yearText = years + " year";
        } else {
            yearText = years + " years";
        }

        // Handle months
        if (months == 1) {
            monthText = months + " month";
        } else {
            monthText = months + " months";
        }

        // Handle days
        if (days == 1) {
            dayText = days + " day";
        } else {
            dayText = days + " days";
        }

        // Print the complete result
        System.out.println(yearText + ", " + monthText + ", and " + dayText + ".");

    }
}
