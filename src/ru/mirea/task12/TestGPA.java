package ru.mirea.task12;
import java.util.Arrays;
import java.util.Scanner;

public class TestGPA {
    public static void main(String []args){
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        System.out.println("Введите колличество студентов");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("Введите баллы и имена студентов");
        Students [] students = new Students[k];
        for (int i = 0;i < students.length;i++){
            int m = scanner.nextInt();
            String name = scanner.nextLine();
            students[i]= new Students(m,name);
        }
        sort.quicksort(students,0,students.length-1);
        System.out.println("Отсортированный массив  (быстрая сортировка)");
        for(int i = 0;i < students.length;i++){
            System.out.println(students[i].toString2());
        }
        System.out.println();
    }
}
