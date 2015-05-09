package design_pattern.creational.abstract_factory;

import design_pattern.creational.abstract_factory.color.Color;
import design_pattern.creational.abstract_factory.shape.Circle;
import design_pattern.creational.abstract_factory.shape.Rectangle;
import design_pattern.creational.abstract_factory.shape.Shape;

public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
    
}
