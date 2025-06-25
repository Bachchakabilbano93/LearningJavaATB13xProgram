package JavaATB13xTasks;

import java.util.Scanner;

public class $24th_June_Task8_Triangle_Validation {
    public static void main(String[] args) {
//        Check if a Triangle is Valid Based on Three Sides.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int a = scanner.nextInt();
        System.out.println("Enter the second side of the triangle");
        int b = scanner.nextInt();
        System.out.println("Enter the third side of the triangle");
        int c = scanner.nextInt();

        if (a + b > c && a + b != c){
            System.out.println("The triangle with sides " + a + ", " + b + ", " + c + ", " + "is valid");
        } else if (b + c > a && b + c != a){
            System.out.println("The triangle with sides " + a + ", " + b + ", " + c + ", " + "is valid");
        } else if (c + a > b && c + a != b){
            System.out.println("The triangle with sides " + a + ", " + b + ", " + c + ", " + "is valid");
        }else{
            System.out.println("The triangle is not valid");
        }
    }
}
