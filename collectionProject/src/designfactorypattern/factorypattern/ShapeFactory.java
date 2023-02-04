package designfactorypattern.factorypattern;

//import org.apache.commons.lang3.StringUtils;

public class ShapeFactory {
	
	public Shape getShape(String input) {
		//if (StringUtils.equalsIgnoreCase(input,"")) 
			
		if(input.equalsIgnoreCase("S")) {
			Shape s = new Square(); 
			return s;
		}
		else if(input.equalsIgnoreCase("R")) {
			Shape s = new Rectangle(); 
			return s;
		}
		else if(input.equalsIgnoreCase("C")) {
			Shape s = new Circle(); 
			return s;
		}
		return null;
	}

}
