package ru.mirea.task3;

public class Leg
{
    private double length;
    private boolean seat_down;
    public Leg(double l, boolean s)
    {
        seat_down = s;
        length = l;
    }
    public void setLength(double length) {this.length = length;}
    public double getLength() {return length;}
    public void setSeat(boolean seat_down) {this.seat_down = seat_down;}
    public String IsSeat() {
        if (seat_down = true) {
            return("Человек сидит");
        }
        else {
            return("Руки опущены");
        }
    }
}
