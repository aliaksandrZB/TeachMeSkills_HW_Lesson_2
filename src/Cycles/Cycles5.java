package Cycles;

public class Cycles5 {
    public static void main(String[] args) {
        for (int i = 0, num = 0; i < 10; ++i) {
            System.out.print((num += -5) + " ");
        }
    }
}
