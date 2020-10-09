package drawing.tool;

public class Square extends BaseShape {

    public int length;

    public Square(int length)
    {
        this.length = length;
    }

    public int calculateSurface() {
        int surface = length * length;
        return surface;
    }

    public int calculatePerimeter() {
        int perimeter = length * 4;
        return perimeter;
    }
}
