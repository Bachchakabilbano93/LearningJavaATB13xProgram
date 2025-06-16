package JavaATB13xTasks;

import java.util.Scanner;

public class $16th_June_Task_Triangle_Classifier {
    public static void main(String[] args) {
/*
        Triangle Classifier:Write a program that classifies a triangle based on its side lengths.
        Given three input values representing the lengths of the sides, determine if the triangle
        is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene
        (no sides are equal). Use an if-else statement to classify the triangle.
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side");
        int x = scanner.nextInt();
        System.out.println("Enter second side");
        int y = scanner.nextInt();
        System.out.println("Enter 3rd side");
        int z = scanner.nextInt();
        /*int x = 5;
        int y = 6;
        int z = 7;*/

        if (x == y && y == z) {
            System.out.println("Equilateral Triangle");
        } else if (x == y || y == z || z == x) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }
}
