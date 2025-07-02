package JavaATB13xTasks;

public class $27th_June_Arrays_2D_Task3_Matrix_Star_Pattern_Print {
    public static void main(String[] args) {
//         *
//        ***
//       *****
        int rows = 3; // Number of rows in the pattern

        // Loop for each row
        for (int i = 1; i <= rows; i++) {

            // Print spaces before stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
