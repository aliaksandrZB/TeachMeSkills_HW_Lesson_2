package ControlStructures;

import java.util.Scanner;

public class ControlStructures3 {

    public static void main(String[] args) {
        System.out.println("Enter a number to check for parity. To exit the program press 0 and confirm exit: ");

        Scanner sc = new Scanner(System.in);
        int num;
        char choice;
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("Do you want to exit the program? Yes (Y) / No, I want to check the number 0 (N): ");
                choice = sc.next().charAt(0);
                if (choice == 'Y' || choice == 'y' || choice == 'н')
                    break;
                else if (choice == 'N' || choice == 'n' || choice == 'т') ;
            }

            System.out.println("This number is " + (num % 2 == 0? "even." : "odd."));
        }

        sc.close();
    }
}