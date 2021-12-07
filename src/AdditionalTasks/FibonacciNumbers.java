package AdditionalTasks;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 11, first = 0; int second = 1;
        while (n-- != 0) {
            System.out.print(first + " ");
            second += first;
            first = second - first;
        }
    }
}
