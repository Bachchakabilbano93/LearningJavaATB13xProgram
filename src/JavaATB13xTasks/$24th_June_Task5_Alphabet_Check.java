package JavaATB13xTasks;

import java.util.Scanner;

public class $24th_June_Task5_Alphabet_Check {
    public static void main(String[] args) {
//        Check if a Character is an Alphabet.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().toLowerCase().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is an Alphabet");
        } else{
            System.out.println(ch + " is not an Alphabet");
        }

        scanner.close();

    }
}
