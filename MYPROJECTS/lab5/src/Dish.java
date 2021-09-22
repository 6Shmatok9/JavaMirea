public abstract class Dish {
    private int volume;
    private String color;

    public int getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public Dish(int volume, String color) {
        this.volume = volume;
        this.color = color;
    }
}

class Cup extends Dish {
    private String material;

    public Cup(int volume, String color, String material) {
        super(volume, color);
        this.material=material;
    }

    public void displayInfo(){
        System.out.println("Кружка, объёмом " + super.getVolume() + " ml, цвета "
                + super.getColor() + ", сделана из " + material);
    }
}

class Plate extends Dish {
    private int diameter;

    public Plate(int volume, String color, int diameter) {
        super(volume, color);
        this.diameter=diameter;
    }

    public void displayInfo(){
        System.out.println("Тарелка, объёмом " + super.getVolume() + " ml, цвета "
                + super.getColor() + ", имеет диаметер, равный " + diameter + " cm" );
    }
}

class Pan extends Dish {
    private boolean non_stick;

    public Pan(int volume, String color, boolean non_stick) {
        super(volume, color);
        this.non_stick=non_stick;
    }

    public void displayInfo(){
        if (non_stick = true) {
            System.out.print("Антипригарная сковорода, цвета ");
        }
        else {System.out.print("Неантипригарная сковорода, цвета ");}
        System.out.println(super.getColor() + ", имеет объём, равный " + super.getVolume() + " ml" );
    }
}

