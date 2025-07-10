package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

public class Task6_Catch_vs_Generic {
    public static void main(String[] args) {
        /*✅ Task 6: Catch Specific vs Generic Exception
📘 Description:
Try the same code twice — once using catch(Exception e) and once using catch(NullPointerException e).
Compare output and behavior.*/

        String s1 = null;
        String s2 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            s2.trim();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


    }
}
