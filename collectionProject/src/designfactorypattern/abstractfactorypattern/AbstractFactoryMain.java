package designfactorypattern.abstractfactorypattern;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		
//		Abstract Factory patterns work around a super-factory which creates other factories. 
//		This factory is also called as factory of factories.
//		
//		Implementation:-
//		We are going to create a Shape interface and a concrete class implementing it. 
//		We create an abstract factory class AbstractFactory as next step. 
//		Factory class ShapeFactory is defined, which extends AbstractFactory. 
//		A factory creator/generator class FactoryProducer is created.
//		
//		Step 1
//		Create an interface for Shapes.
//		Step 2
//		Create concrete classes implementing the same interface.
//		Step 3
//		Create an Abstract class to get factories for Normal and Rounded Shape Objects.
//		Step 4
//		Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.
//		Step 5
//		Create a Factory generator/producer class to get factories by passing an information such as Shape
//		Step 6
//		Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes 
//		by passing an information such as type.
		
		// TODO Auto-generated method stub
		
		FactoryProducer fp = new FactoryProducer();
		AbstractFactory af = fp.getFactory(false);
		Shape s = af.getshape("R");
		s.draw();
	}

}
