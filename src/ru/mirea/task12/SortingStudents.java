package ru.mirea.task12;
import java.util.Scanner;

public class SortingStudents {

    public static void Sort(Students[] a) {
        for(int i = 1; i < 6; i++){
            for(int j = i; j > 0 && a[j-1].id > a[j].id; j--) {
                Students tmp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students[] s = new Students[6];
        System.out.println("Введите id 6 студентов");
        for (int i = 0; i < 6; i++) {
            int id = sc.nextInt();
            String name = sc.nextLine();
            s[i] = new Students(id, name);
        }
        Sort(s);
        for (int i = 0; i < 6; i++)
            System.out.println(s[i].toString());

    }
}