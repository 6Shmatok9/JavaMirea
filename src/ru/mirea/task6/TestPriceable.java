public class TestPriceable {
    public static void main(String[] args) {
        Chair c = new Chair("Big", "Brown", 100);
        Table t = new Table("Small", "White", 150);
        Sofa s = new Sofa("Big", "Red", 200);
        Armchair a = new Armchair("Small", "Green", 180);
        System.out.println(c.getPrice());
        System.out.println(t.getPrice());
        System.out.println(s.getPrice());
        System.out.println(a.getPrice());
    }
}