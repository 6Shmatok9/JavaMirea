package ru.mirea.task5;

public abstract class Dog {
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

class Bulldog extends Dog {

    public Bulldog(String name, int weight) {
        super(name, weight);
    }

    public void displayInfo(){
        System.out.println("Бульдог " + super.getName() + " весит " + super.getWeight() + " кг");
    }
}

class GermanShepherd extends Dog {

    public GermanShepherd(String name, int weight) {
        super(name, weight);
    }

    public void displayInfo(){
        System.out.println("Немецкая овчарка " + super.getName() + " весит " + super.getWeight() + " кг");
    }
}

class Pug extends Dog {

    public Pug(String name, int weight) {
        super(name, weight);
    }

    public void displayInfo(){
        System.out.println("Мопс " + super.getName() + " весит " + super.getWeight() + " кг");
    }
}

class Chihuahua extends Dog {

    public Chihuahua(String name, int weight) {
        super(name, weight);
    }

    public void displayInfo(){
        System.out.println("Чихуахуа " + super.getName() + " весит " + super.getWeight() + " кг");
    }
}

class Beagle extends Dog {

    public Beagle(String name, int weight) {
        super(name, weight);
    }

    public void displayInfo(){
        System.out.println("Гончая " + super.getName() + " весит " + super.getWeight() + " кг");
    }
}