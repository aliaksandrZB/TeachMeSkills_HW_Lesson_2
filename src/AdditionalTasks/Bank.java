package AdditionalTasks;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        System.out.println("Enter the deposit amount and the number of months: ");

        Scanner sc = new Scanner(System.in);
        float sum = sc.nextFloat();
        int mouth = sc.nextInt();

        for (int i = 0; i < mouth; ++i) {
            sum *= 1.07;
        }

        System.out.println("Final deposit amount: " + sum);
    }
}
