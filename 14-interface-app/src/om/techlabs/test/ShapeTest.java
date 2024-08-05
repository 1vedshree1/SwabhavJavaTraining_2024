package om.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;

public class ShapeTest {
public static void main(String[] args) {
	Circle circle = new Circle(10);
	Rectangle rectangle = new Rectangle(10,20);
	
	circle.area();
	rectangle.area();
}
}
