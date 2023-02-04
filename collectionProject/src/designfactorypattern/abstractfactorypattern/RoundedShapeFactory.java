package designfactorypattern.abstractfactorypattern;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getshape(String s) {
		if (s.equalsIgnoreCase("R")) {
			Shape obj = new RoundedRectangle();
			return obj;
		}
		else if (s.equalsIgnoreCase("C")) {
			Shape obj = new RoundedCircle();
			return obj;
		}
		return null;
	}



}
