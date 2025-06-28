package JavaATB13xTasks;

import java.util.Scanner;

public class $25th_June_Task6_Net_Salary_Calculation {
    public static void main(String[] args) {
//        Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,) Reserch from your side for this program.
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter Employee Basic Pay: Rs. ");
        double basicPay = scanner.nextDouble();

        // Calculate allowances
        double hra = calculateHRA(basicPay);
        double da = calculateDA(basicPay);
        double grossSalary = calculateGrossSalary(basicPay, hra, da);

        // Calculate deductions
        double incomeTax = calculateIncomeTax(grossSalary);
        double pf = calculatePF(basicPay);
        double professionalTax = calculateProfessionalTax(grossSalary);

        // Calculate net salary
        double netSalary = calculateNetSalary(grossSalary, incomeTax, pf, professionalTax);

        // Display salary breakdown
        System.out.println("\n========== SALARY BREAKDOWN ==========");
        System.out.println("Basic Pay:              Rs. " + basicPay);
        System.out.println("HRA (40%):              Rs. " + hra);
        System.out.println("DA (12%):               Rs. " + da);
        System.out.println("--------------------------------------");
        System.out.println("Gross Salary:           Rs. " + grossSalary);
        System.out.println("======================================");

        System.out.println("\n========== DEDUCTIONS ==========");
        System.out.println("Income Tax:             Rs. " + incomeTax);
        System.out.println("PF (12%):               Rs. " + pf);
        System.out.println("Professional Tax:       Rs. " + professionalTax);
        System.out.println("-------------------------------");
        System.out.println("Total Deductions:       Rs. " + (incomeTax + pf + professionalTax));
        System.out.println("===============================");

        System.out.println("\n========== FINAL SALARY ==========");
        System.out.println("NET SALARY:             Rs. " + netSalary);
        System.out.println("==================================");

        // Additional information
        System.out.println("\n========== ANNUAL BREAKDOWN ==========");
        System.out.println("Annual Gross Salary:    Rs. " + (grossSalary * 12));
        System.out.println("Annual Net Salary:      Rs. " + (netSalary * 12));
        System.out.println("======================================");

        scanner.close();
    }

    public static double calculateHRA(double basicPay) {
        // HRA is typically 40% of Basic Pay in metro cities, 30% in non-metro
        // Using 40% as standard
        return basicPay * 0.40;
    }

    // Function to calculate DA (Dearness Allowance)
    public static double calculateDA(double basicPay) {
        // DA is typically 12% of Basic Pay (varies by organization)
        return basicPay * 0.12;
    }

    // Function to calculate Gross Salary
    public static double calculateGrossSalary(double basicPay, double hra, double da) {
        return basicPay + hra + da;
    }

    // Function to calculate Income Tax (simplified tax calculation)
    public static double calculateIncomeTax(double grossSalary) {
        double annualSalary = grossSalary * 12;
        double tax = 0.0;

        // Income Tax Slabs (Old Regime - Simplified)
        if (annualSalary <= 250000) {
            tax = 0; // No tax for income up to 2.5 lakh
        } else if (annualSalary <= 500000) {
            tax = (annualSalary - 250000) * 0.05; // 5% for 2.5L to 5L
        } else if (annualSalary <= 1000000) {
            tax = 12500 + (annualSalary - 500000) * 0.20; // 20% for 5L to 10L
        } else {
            tax = 112500 + (annualSalary - 1000000) * 0.30; // 30% above 10L
        }

        // Convert annual tax to monthly
        return tax / 12;
    }

    // Function to calculate PF (Provident Fund)
    public static double calculatePF(double basicPay) {
        // Employee PF contribution is 12% of Basic Pay
        return basicPay * 0.12;
    }

    // Function to calculate Professional Tax
    public static double calculateProfessionalTax(double grossSalary) {
        // Professional Tax varies by state, using standard 200 per month
        if (grossSalary > 15000) {
            return 200;
        } else if (grossSalary > 10000) {
            return 150;
        } else {
            return 0;
        }
    }

    // Function to calculate Net Salary
    public static double calculateNetSalary(double grossSalary, double incomeTax, double pf, double professionalTax) {
        double totalDeductions = incomeTax + pf + professionalTax;
        return grossSalary - totalDeductions;
    }

}
