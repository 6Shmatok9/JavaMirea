
package ru.mirea.task13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        String str1 = new String("Chicago");
        String str2 = new String("New York");
        String str3 = new String("Berlin");
        String str4 = new String("Moscow");

        //инициализация
        LinkedList<String> cities = new LinkedList<>();
        //заполнение
        cities.add(str1);
        cities.add(str2);
        cities.add(str3);
        cities.add(str4);
        System.out.println(cities);
        System.out.println();
        //с индексами
        cities.add(str1);
        cities.add(str3);
        cities.add(1, str2);
        System.out.println(cities);
        System.out.println();
        //удаление элементов
        cities.remove(1);
        System.out.println(cities);
    }
}
