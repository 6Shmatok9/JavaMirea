package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("John","jhn.@j.k", 'M');
        System.out.println(a1);
        a1.setEmail("john@email.net");
        System.out.println(a1);
    }
}
