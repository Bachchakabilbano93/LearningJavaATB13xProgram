package JavaATB13xTasks;

public class $27th_June_Arrays_2D_Task2_Matrix_Diagonal_Sum_Calculation {
    public static void main(String[] args) {
//        Write a Java Program to Calculate Matrix Diagonal Sum
        // Initialize a sample matrix (3x3)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int size = matrix.length; // Size of square matrix

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate diagonal sum
        int diagonalSum = 0;
        System.out.print("Diagonal Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
            diagonalSum += matrix[i][i];
        }
        System.out.println("\nDiagonal Sum = " + diagonalSum);
    }
}
