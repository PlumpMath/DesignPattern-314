package design_pattern.creational.abstract_factory;

import design_pattern.creational.abstract_factory.color.Color;
import design_pattern.creational.abstract_factory.shape.Shape;

public abstract class AbstractFactory {

    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
    
}
