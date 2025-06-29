package JavaATB13xTasks;

import java.util.Scanner;

public class $27th_June_Task3_Domain_Type {
    public static void main(String[] args) {
/*        Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
           :- take the Site URL input from the user
        Example Scenarios
        Input: example.com
        Output: The website type is: Commercial website
        Input: example.org
        Output: The website type is: Non-profit organization
        Input: example.edu
        Output: The website type is: Educational institution
        Input: example.gov
        Output: The website type is: Government website
        Input: example.net
        Output: The website type is: Network-related website
        Input: example.info
        Output: The website type is: Informational website
        Input: example.xyz
        Output: The website type is: Unknown or other types of websites*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the website URL:");
        String url = scanner.next();
        if(url.contains(".com")){
            System.out.println("The website type is: Commercial website");
        } else if (url.contains(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (url.contains(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (url.contains(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (url.contains(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if (url.contains(".info")) {
            System.out.println("The website type is: Informational website");
        } else{
            System.out.println("The website type is: Unknown or other types of websites");
        }

        scanner.close();

    }
}
