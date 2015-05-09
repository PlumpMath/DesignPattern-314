package design_pattern.creational.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == "rectangle") {
            return new Rectangle();
        }
        
        if (shapeType == "circle") {
            return new Circle();
        }
        
        if (shapeType == "square") {
            return new Square();
        }
        
        return null;
    }
}
