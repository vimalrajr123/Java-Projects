package designfactorypattern.factorypattern;

public class FactoryMain {
	
//	In Factory pattern, we create object without exposing the creation logic to the client 
//	and refer to newly created object using a common interface.
//
//	Implementation:-
//	We're going to create a Shape interface and 
//	concrete classes implementing the Shape interface. 
//	A factory class ShapeFactory is defined as a next step.
//
//	FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object. 
//	It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.
	
//	Step 1
//	Create an interface.
//	Step 2
//	Create concrete classes implementing the same interface.
//	Step 3
//	Create a Factory to generate object of concrete class based on given information.
//	Step 4
//	Use the Factory to get object of concrete class by passing an information such as type.
	
	

	public static void main(String[] args) {
		ShapeFactory shapeFactory =  new ShapeFactory();
		Shape s = shapeFactory.getShape("R");
		s.draw();
	}

}
