package ru.mirea.task12;

public class Students {
    int id;
    String name;

    Students(int id, String name) {
       this.id = id;
       this.name = name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return  "Student №" + id + " "+ name;
    }

    public String toString2() {
        return  name+" ("+id+ " баллов)";
    }
}
