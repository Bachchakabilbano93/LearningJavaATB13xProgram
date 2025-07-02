package JavaATB13xTasks;

public class $27th_June_Arrays_2D_Task1_Matrix_Transpose {
    public static void main(String[] args) {
//        Write a Java Program to Transpose a Matrix
        // Initialize a sample matrix (3x3)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = matrix.length;        // Number of rows in original matrix
        int cols = matrix[0].length;     // Number of columns in original matrix

        // Print original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        // Create transposed matrix with swapped dimensions
        int[][] transposed = new int[cols][rows];

        // Fill the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // Print transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
