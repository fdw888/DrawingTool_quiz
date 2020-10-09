package drawing.tool;

public class Rectangle extends BaseShape {

    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateSurface() {
        int surface = length * width;
        return surface;
    }

    public int calculatePerimeter() {
        int perimeter = 2 * (length + width);
        return perimeter;
    }
}
