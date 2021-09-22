public class Human {
    public Head head;
    public Hand hands;
    public Leg legs;

    public Human(double hr, String hc, double hl, double ll) {
        head = new Head(hr,hc);
        hands = new Hand(hl);
        legs = new Leg(ll);
    }
}
