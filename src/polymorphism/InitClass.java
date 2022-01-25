package polymorphism;

public class InitClass
{

	public static void main(String[] args)
	{
		Circle circle = new Circle();
		Triangle tri = new Triangle();
		Drawing draw = new Drawing();
		draw.setShape(tri);
		draw.drawShape();
	}
	
}
