import java.util.Scanner;

public class Factorial5 {
    public static int Factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        };
        return fac;
    }
    public static void main(String[] args) {
        System.out.print("Введите число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Факториал числа " + num + " равен " + Factorial(num));
    }
}
