package ru.mirea.task1;
import java.util.Scanner;

public class Summa1 {
    public static void main(String[] args) {
        int[] m = new int[10];
        System.out.println("Введите 10 элементов массива:");
        for (int i = 0; i < 10; i++) {
            Scanner in = new Scanner(System.in);
            m[i] = in.nextInt();
        }
        System.out.println("Массив:");
        for (int i = 0; i < 10; i++) {
            System.out.print(m[i] + " ");
        }
        int summa = 0;
        for (int i = 0; i < 10; i++) {
            summa += m[i];
        }
        System.out.println("\nСумма всех элементов массива равна: " + summa);
        summa = 0;
        int i = 0;
        while (i<10) {
            summa += m[i];
            i++;
        }
        System.out.println("\nСумма всех элементов массива равна: " + summa);
        summa = 0;
        i = 0;
        do {
            summa += m[i];
            i++;
        } while (i < 10);
        System.out.println("\nСумма всех элементов массива равна: " + summa);
    }
}

