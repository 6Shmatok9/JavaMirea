package ru.mirea.task7;

public interface Movable
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() { y -= ySpeed; }

    public void moveRight() {
        x += xSpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public String toString() {
        return ("(" + x + "; " + y + "; " + xSpeed + "; " + ySpeed + ")");
    }

}

class MovableCircle implements Movable
{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {center.moveDown();}

    public void moveRight() {center.moveRight();}

    public void moveLeft() {
        center.moveLeft();
    }

    public String toString() {
        return ("Центр круга (радиус = "+ radius + ") был перенесён на координаты х = " + center.x + " и у = " + center.y);
    }
}

class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }

    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString()
    {
        return "Левая верхняя точка прямоугольника была перенесена на координаты x = "+topLeft.x+" и y = "+topLeft.y+", а правая нижняя - на координаты x = "+bottomRight.x+" и y = "+bottomRight.y;
    }
}
