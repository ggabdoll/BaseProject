package inheritance;

public class Circle extends Shape {

	private double radius;
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Circle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}


	public void calculationArea() {
		this.area = Math.PI*radius*radius;
		
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	

}
