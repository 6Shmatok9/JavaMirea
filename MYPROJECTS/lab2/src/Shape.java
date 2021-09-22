public class Shape {
    private int size;
    private String color;
    private String type;
    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
        this.size = size;
    }
    public String toString() {
        return("Фигура " + type + ", цвета " + color);
    }
}
