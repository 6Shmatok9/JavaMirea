package ru.mirea.task6;

public class Dog implements Nameable {
    private int weight;
    private String name;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Dog(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }
}
