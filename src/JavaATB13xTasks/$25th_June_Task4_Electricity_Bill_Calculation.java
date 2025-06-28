package JavaATB13xTasks;

import java.util.Scanner;

public class $25th_June_Task4_Electricity_Bill_Calculation {
    public static void main(String[] args) {
        /*Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.
                Implement Rate Structure:
        Define the rate structure for calculating the bill based on the number of units consumed.
            :-  First 100 units: 0.50Rs per unit
        :-  Next 100 units (101-200): 0.75Rs per unit
        :- Next 100 units (201-300): 1.20Rs per unit
        :- Above 300 units: 1.50Rs per unit*/
        Scanner scanner = new Scanner(System.in);
        // Get input from user
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        // Call the calculateBill function
        double bill = calculateBill(units);
        // Display the result
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Total Units Consumed: " + units);
        System.out.println("Total Bill Amount: Rs." + bill);

        scanner.close();

    }

    static double calculateBill(int units) {
        double totalBill = 0.0;
        int remainingUnits = units;

        // Rate structure
        double rate1 = 0.50; // First 100 units
        double rate2 = 0.75; // Next 100 units (101-200)
        double rate3 = 1.20; // Next 100 units (201-300)
        double rate4 = 1.50; // Above 300 units

        // First 100 units at 0.50Rs per unit
        if (remainingUnits > 0) {
            int unitsInSlab1 = 0;
            if (remainingUnits >= 100) {
                unitsInSlab1 = 100;
            } else {
                unitsInSlab1 = remainingUnits;
            }

            double amountSlab1 = unitsInSlab1 * rate1;
            totalBill = totalBill + amountSlab1;
            remainingUnits = remainingUnits - unitsInSlab1;
        }

        // Next 100 units (101-200) at 0.75Rs per unit
        if (remainingUnits > 0) {
            int unitsInSlab2 = 0;
            if (remainingUnits >= 100) {
                unitsInSlab2 = 100;
            } else {
                unitsInSlab2 = remainingUnits;
            }

            double amountSlab2 = unitsInSlab2 * rate2;
            totalBill = totalBill + amountSlab2;
            remainingUnits = remainingUnits - unitsInSlab2;
        }

        // Next 100 units (201-300) at 1.20Rs per unit
        if (remainingUnits > 0) {
            int unitsInSlab3 = 0;
            if (remainingUnits >= 100) {
                unitsInSlab3 = 100;
            } else {
                unitsInSlab3 = remainingUnits;
            }

            double amountSlab3 = unitsInSlab3 * rate3;
            totalBill = totalBill + amountSlab3;
            remainingUnits = remainingUnits - unitsInSlab3;
        }

        // Above 300 units at 1.50Rs per unit
        if (remainingUnits > 0) {
            double amountSlab4 = remainingUnits * rate4;
            totalBill = totalBill + amountSlab4;
        }

        return totalBill;
    }


}
