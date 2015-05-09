package design_pattern.creational.abstract_factory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
        shapeFactory.getShape("CIRCLE").draw();;
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        
        colorFactory.getColor("RED").fill();;
        
    }
    
}
