package ControlStructures;

import java.util.Scanner;

class ControlStructures1 {
    public static void main(String[] args) {
        System.out.println("Enter the month number in the nominative case or a digit. Enter '0' to end the program: ");

        Scanner sc = new Scanner(System.in);
        String month;
        do {
            month = sc.next();
            switch (month) {
                case "1":
                case "One":
                case "one":
                    System.out.println("January.");
                    break;
                case "2":
                case "Two":
                case "two":
                    System.out.println("February.");
                    break;
                case "3":
                case "Three":
                case "three":
                    System.out.println("March.");
                    break;
                case "4":
                case "Four":
                case "four":
                    System.out.println("April.");
                    break;
                case "5":
                case "Five":
                case "five":
                    System.out.println("May.");
                    break;
                case "6":
                case "Six":
                case "six":
                    System.out.println("June.");
                    break;
                case "7":
                case "Seven":
                case "seven":
                    System.out.println("July.");
                    break;
                case "8":
                case "Eight":
                case "eight":
                    System.out.println("August.");
                    break;
                case "9":
                case "Nine":
                case "nine":
                    System.out.println("September.");
                    break;
                case "10":
                case "Ten":
                case "ten":
                    System.out.println("October.");
                    break;
                case "11":
                case "Eleven":
                case "eleven":
                    System.out.println("November.");
                    break;
                case "12":
                case "Twelve":
                case "twelve":
                    System.out.println("December.");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("There is no such month!");
            }
        } while (!month.equals("0"));

        sc.close();
    }
}