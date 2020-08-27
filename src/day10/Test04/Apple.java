package day10.Test04;

public class Apple {
    int Size;
    String color;

    public Apple(int size, String color) {
        Size = size;
        this.color = color;
    }

    public Apple() {
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
