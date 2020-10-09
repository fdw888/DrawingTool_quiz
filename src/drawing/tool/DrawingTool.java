package drawing.tool;

import java.util.ArrayList;
import java.util.List;

public class DrawingTool {

    List<Shape> shapesList = new ArrayList<>();

    public void addShape(Shape newShape) {
        for (Shape existingShape : shapesList) {
            Class newShapeClass = newShape.getClass();
            Class existingShapeClass = existingShape.getClass();
            if (newShapeClass.equals(existingShapeClass)) {
                throw new IllegalArgumentException("Shape already exists");
            }
        }
        shapesList.add(newShape);

    }

    public int calculatePerimeterSum() {
        int sumPerimeter = 0;
        for (Shape shape : shapesList) {
            sumPerimeter = sumPerimeter + shape.calculatePerimeter();

        }
        return sumPerimeter;

    }

    public int calculateSurfaceSum() {
        int sumSurface = 0;
        for (Shape shape : shapesList) {
            sumSurface = sumSurface + shape.calculateSurface();

        }
        return sumSurface;
    }
}
