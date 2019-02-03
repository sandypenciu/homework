package quiz;
import java.util.Scanner;
import java.util.*;

public class Circle implements Shapes {
	List<Circle> listC = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double radius;

	public Circle(double a) {
		this.radius = a;
	}
	
	public Circle() {
		
	}
	
	@Override
	public void addShape() {
		System.out.println("Enter radius: ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		Circle cerc = new Circle(a);
		for (Circle c : listC) {
			if (c.radius == a) {
				cerc = null;
				System.out.println("Similar shape is already on the list. ");
			} else {listC.add(cerc);}
		}
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = 2 * 3.14 * this.radius;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		this.surface = 3.14 * this.radius * this.radius;
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Circle c : listC) {
			totalP = totalP + c.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for (Circle c : listC) {
			totalS = totalS + c.calculateSurface();
		}
		return totalS;
	}
	
}