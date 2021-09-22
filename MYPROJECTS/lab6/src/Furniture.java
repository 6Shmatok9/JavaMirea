public abstract class Furniture {
    private String size;
    private String color;
    private int price;

    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }

    public Furniture(String size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
}

class Chair extends Furniture {
    public Chair(String size, String color, int price)
    {
        super(size, color, price);
    }
    public void displayInfo(){
        System.out.println(super.getSize() + " " + super.getColor() + " Chair for" + super.getPrice() + "$");
    }
}

class Table extends Furniture {
    public Table(String size, String color, int price)
    {
        super(size, color, price);
    }
    public void displayInfo(){
        System.out.println(super.getSize() + " " + super.getColor() + " Table for" + super.getPrice() + "$");
    }
}

class Sofa extends Furniture {
    public Sofa(String size, String color, int price)
    {
        super(size, color, price);
    }
    public void displayInfo(){
        System.out.println(super.getSize() + " " + super.getColor() + " Sofa for" + super.getPrice() + "$");
    }
}

class Armchair extends Furniture {
    public Armchair(String size, String color, int price)
    {
        super(size, color, price);
    }
    public void displayInfo(){
        System.out.println(super.getSize() + " " + super.getColor() + " Armchair for" + super.getPrice() + "$");
    }
}
