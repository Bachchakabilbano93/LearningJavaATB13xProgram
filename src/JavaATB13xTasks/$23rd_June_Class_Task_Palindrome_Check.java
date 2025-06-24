package JavaATB13xTasks;

import java.util.Scanner;

public class $23rd_June_Class_Task_Palindrome_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = scanner.nextLine();
        s1 = s1.toLowerCase();
        String s1_reverse = reverse(s1);

        if(s1.equals(s1_reverse)){
            System.out.println(s1 + " is a palindrome");
        } else {
            System.out.println(s1 + " is not a palindrome");
        }

        scanner.close();

    }

    public static String reverse(String name) {
        String name_reverse = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            name_reverse += name.charAt(i);
        }
        return name_reverse;
    }

}
