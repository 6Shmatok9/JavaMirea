public class TestDog {
    public static void main(String[] args) {
        Bulldog d1 = new Bulldog("Name1",20);
        GermanShepherd d2 = new GermanShepherd("Name2",25);
        Pug d3 = new Pug("Name3",15);
        Chihuahua d4 = new Chihuahua("Name4",10);
        Beagle d5 = new Beagle("Name5",26);
        d1.displayInfo();
        d2.displayInfo();
        d3.displayInfo();
        d4.displayInfo();
        d5.displayInfo();
    }
}
