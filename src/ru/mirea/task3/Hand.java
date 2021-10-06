package ru.mirea.task3;

public class Hand
{
    private double length;
    private boolean raise_up;
    public Hand(double l, boolean r)
    {
        raise_up = r;
        length = l;
    }
    public void setLength(double length) {this.length = length;}
    public double getLength() {return length;}
    public void setRaise(boolean raise_up) {this.raise_up = raise_up;}
    public String IsRaise() {
        if (raise_up = true) {
            return("Руки подняты");
        }
        else {
            return("Руки опущены");
        }
    }
}