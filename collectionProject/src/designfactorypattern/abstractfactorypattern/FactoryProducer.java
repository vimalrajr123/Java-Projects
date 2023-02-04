package designfactorypattern.abstractfactorypattern;

public class FactoryProducer {
	
	public AbstractFactory getFactory(boolean b) {
		if(b) {
			RoundedShapeFactory r = new RoundedShapeFactory();
			return r;
		}
		else {
			ShapeFactory r = new ShapeFactory();
			return r;
		}
	}

}
