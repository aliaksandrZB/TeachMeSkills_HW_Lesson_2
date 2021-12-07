package ControlStructures;

import java.util.Scanner;

public class ControlStructures4 {

    public static void main(String[] args) {
        System.out.println("Enter the outside temperature. To exit the program press 0 and confirm exit: ");

        Scanner sc = new Scanner(System.in);
        int temperature;
        char choice;
        while (true) {
            temperature = sc.nextInt();
            if (temperature == 0) {
                System.out.println("Do you want to exit the program? Yes (Y) / No, i want to check zero temperature (N): ");
                choice = sc.next().charAt(0);
                if (choice == 'Y' || choice == 'y' || choice == 'н')
                    break;
                else if (choice == 'N' || choice == 'n' || choice == 'т') ;
            }

            if (temperature > -5)
                System.out.println("Warmly");
            else if (temperature <= -5 && temperature >= -20)
                System.out.println("Normal");
            else
                System.out.println("Cold");
        }

        sc.close();
    }
}