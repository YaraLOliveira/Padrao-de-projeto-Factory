
package pattern.creational.factory;

public class FactoryPatternDemo {
tatic void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle =  factory.getShape("circle");
		circle.draw();
		
		Shape rectangle =  factory.getShape("rectangle");
		rectangle.draw();

	}

}
