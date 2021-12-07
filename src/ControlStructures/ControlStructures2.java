package ControlStructures;

import java.util.Scanner;

public class ControlStructures2 {

    public static void main(String[] args) {
        System.out.println("Enter the month number in the nominative case or a digit. Enter '0' to end the program: ");

        Scanner sc = new Scanner(System.in);
        String month;
        while (true) {
            month = sc.next();
            if (month.equals("1") || month.equals("One") || month.equals("one"))
                System.out.println("January.");

            else if (month.equals("2") || month.equals("Two") || month.equals("two"))
                System.out.println("February.");

            else if (month.equals("3") || month.equals("Three") || month.equals("three"))
                System.out.println("March.");

            else if (month.equals("4") || month.equals("Four") || month.equals("four"))
                System.out.println("April.");

            else if (month.equals("5") || month.equals("Five") || month.equals("five"))
                System.out.println("May.");

            else if (month.equals("6") || month.equals("Six") || month.equals("six"))
                System.out.println("June.");

            else if (month.equals("7") || month.equals("Seven") || month.equals("seven"))
                System.out.println("July.");

            else if (month.equals("8") || month.equals("Eight") || month.equals("eight"))
                System.out.println("August.");

            else if (month.equals("9") || month.equals("Nine") || month.equals("nine"))
                System.out.println("September.");

            else if (month.equals("10") || month.equals("Ten") || month.equals("ten"))
                System.out.println("October.");

            else if (month.equals("11") || month.equals("Eleven") || month.equals("eleven"))
                System.out.println("November.");

            else if (month.equals("12") || month.equals("Twelve") || month.equals("twelve"))
                System.out.println("December.");

            else if (month.equals("0"))
                break;

            else
                System.out.println("There is no such month!");
        }

        sc.close();
    }
}
