public class Human {
    public Head head;
    public Hand hands;
    public Leg legs;

    public Human(double hr, String hc, double hl, double ll, boolean s, boolean r) {
        head = new Head(hr,hc);
        hands = new Hand(hl,s);
        legs = new Leg(ll, r);
    }
    public String toString () {
        return "Цвет волос: " + head.getHairColor() + ", радиус головы: "  + head.getRadius() + "\n"
                + "Площадь и объём головы равны " + head.getArea() + " см и " + head.getSize() + " см соответственно" + "\n"
                + "Длина рук: " + hands.getLength() + " см, длина ног: " + legs.getLength() + " см\n"
                + hands.IsRaise() + "; " + legs.IsSeat();
    }
}
