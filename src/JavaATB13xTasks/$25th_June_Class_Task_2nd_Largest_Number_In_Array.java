package JavaATB13xTasks;

public class $25th_June_Class_Task_2nd_Largest_Number_In_Array {
    public static void main(String[] args) {
//        Find Second Largest Number in an Array
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100, 34
        int max_2nd = give_me_max_2nd(numbers);
        System.out.println(max_2nd);
    }

    static int give_me_max_2nd(int[] testArray) {
        int max_element = testArray[0];
        int max_2nd_element = testArray[0];
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] > max_element){
                max_element = testArray[i];
            }
        }

        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] > max_2nd_element && testArray[i] < max_element){
                max_2nd_element = testArray[i];
            }
        }
        return max_2nd_element;
    }
}
