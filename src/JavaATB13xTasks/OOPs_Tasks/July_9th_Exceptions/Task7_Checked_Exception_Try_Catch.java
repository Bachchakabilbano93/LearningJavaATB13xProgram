package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task7_Checked_Exception_Try_Catch {
    public static void main(String[] args) {
        /*✅ Task 7: Handle Checked Exception using Try-Catch
📘 Description:
Open a file using FileReader and handle FileNotFoundException using try-catch.*/

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
