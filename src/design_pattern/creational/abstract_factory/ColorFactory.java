package design_pattern.creational.abstract_factory;

import design_pattern.creational.abstract_factory.color.Black;
import design_pattern.creational.abstract_factory.color.Color;
import design_pattern.creational.abstract_factory.color.Red;
import design_pattern.creational.abstract_factory.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        
        if (color.equalsIgnoreCase("BLACK")) {
            return new Black();
        }
        return null;
    }

}
