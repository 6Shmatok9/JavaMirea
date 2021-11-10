package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator <Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getId() - o2.getId();
    }

    public void quicksort(Students []students, int low, int high) {
        if (students.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        Students student = students[middle];
        int i = low, j = high;
        while (i <= j) {
            while (compare(students[i], student) > 0) {
                i++;
            }
            while (compare(students[j], student) < 0) {
                j--;
            }
            if (i <= j) {
                Students temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if (low < j) {
                quicksort(students, low, j);
            }
            if (high > i) {
                quicksort(students, i, high);
            }
        }

    }
}
