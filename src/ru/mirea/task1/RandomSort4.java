package ru.mirea.task1;
import java.util.Scanner;

public class RandomSort4 {
    public static void main(String[] args) {
        int[] m = new int[10];
        System.out.print("Массив: ");
        for (int i = 0; i < 10; i++) {
            m[i] = (int) (Math.random() * 100);
            System.out.print(m[i] + " ");
        }
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (m[j] > m[j + 1]) {
                    int tmp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = tmp;
                }
            }
        }
        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(m[i] + " ");
        }
    }
}
