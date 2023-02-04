package designfactorypattern.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getshape(String s) {
		if (s.equalsIgnoreCase("R")) {
			Shape obj = new Rectangle();
			return obj;
		}
		return null;
	}


	
	

}
