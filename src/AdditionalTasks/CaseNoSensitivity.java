import java.util.Scanner;

public class CaseNoSensitivity {
    public static void main(String[] args) {
        System.out.println("Enter the month number in the nominative case or a digit. Enter '0' to end the program: ");

        Scanner sc = new Scanner(System.in);
        String month, str = "";
        int al_num = 0;
        do {
            month = sc.next();
            for (int i = 0; i < month.length(); ++i) {
                if (month.charAt(i) >= 'A' && month.charAt(i) <= 'Z') {
                    al_num = month.charAt(i) - 'A';
                    str += (char) (al_num + 'a');
                }
                else
                    str += month.charAt(i);
            }

            switch (str) {
                case "1":
                case "one":
                    System.out.println("January.");
                    break;
                case "2":
                case "two":
                    System.out.println("February.");
                    break;
                case "3":
                case "three":
                    System.out.println("March.");
                    break;
                case "4":
                case "four":
                    System.out.println("April.");
                    break;
                case "5":
                case "five":
                    System.out.println("May.");
                    break;
                case "6":
                case "six":
                    System.out.println("June.");
                    break;
                case "7":
                case "seven":
                    System.out.println("July.");
                    break;
                case "8":
                case "eight":
                    System.out.println("August.");
                    break;
                case "9":
                case "nine":
                    System.out.println("September.");
                    break;
                case "10":
                case "ten":
                    System.out.println("October.");
                    break;
                case "11":
                case "eleven":
                    System.out.println("November.");
                    break;
                case "12":
                case "twelve":
                    System.out.println("December.");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("There is no such month!");
            }

            str = "";
        } while (!month.equals("0"));

        sc.close();
    }
}