public class FurnitureShop {
    public static void main(String[] args) {
        Chair c = new Chair("Big", "Brown", 100);
        Table t = new Table("Small", "White", 150);
        Sofa s = new Sofa("Big", "Red", 200);
        Armchair a = new Armchair("Small", "Green", 180);
        c.displayInfo();
        t.displayInfo();
        s.displayInfo();
        a.displayInfo();
    }
}
