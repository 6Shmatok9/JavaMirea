public class HumanTest
{
    public static void main(String[] args)
    {
        Human man = new Human(25, "Black", 80, 90);
        System.out.println(man.head.getArea());
        System.out.println(man.head.getSize());
        System.out.println(man.hands.getLength());
        System.out.println(man.legs.getLength());
    }
}
