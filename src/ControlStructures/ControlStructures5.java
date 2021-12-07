package ControlStructures;

import java.util.Scanner;

public class ControlStructures5 {

    public static void main(String[] args) {
        System.out.println("Enter the rainbow color number. Enter '0' to end the program: ");

        Scanner sc = new Scanner(System.in);
        String num;
        do {
            num = sc.next();
            switch (num) {
                case "1":
                case "One":
                case "one":
                    System.out.println("Red.");
                    break;
                case "2":
                case "Two":
                case "two":
                    System.out.println("Orange.");
                    break;
                case "3":
                case "Three":
                case "three":
                    System.out.println("Yellow.");
                    break;
                case "4":
                case "Four":
                case "four":
                    System.out.println("Green.");
                    break;
                case "5":
                case "Five":
                case "five":
                    System.out.println("Blue.");
                    break;
                case "6":
                case "Six":
                case "six":
                    System.out.println("Indigo.");
                    break;
                case "7":
                case "Seven":
                case "seven":
                    System.out.println("Violet.");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("There are only seven colors of the rainbow!");
            }
        } while (!num.equals("0"));

        sc.close();
    }
}
