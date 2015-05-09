package design_pattern.creational.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        
        return null;
    }
}
