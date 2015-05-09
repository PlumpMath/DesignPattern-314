package design_pattern.creational.abstract_factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        
        if (type.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        
        return null;
    }
}
