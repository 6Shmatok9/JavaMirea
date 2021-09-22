public class TestBook {
    public static void main(String[] args) {
        Book bk1 = new Book("Name10", "Title10",1950);
        bk1.setPages(139);
        Book bk2 = new Book(350);
        Book bk3 = new Book("Name42","Title42");
        Book bk4 = new Book();
        bk4.setAuthor("Name15");
        bk4.setPages(999);
        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
        System.out.println(bk4);
    }
}