package quiz;
import java.util.Scanner;
import java.util.*;

public class Rectangle implements Shapes {
	List<Rectangle> list = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double width;
	private double height;

	public Rectangle(double a, double b) {
		this.width = a;
		this.height = b;		
	}
	
	public Rectangle() {
		
	}
	
	@Override
    public void addShape() {
		System.out.println("Enter height and width. ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		Rectangle dreptunghi = new Rectangle (a, b);
		for (Rectangle r : list) {
			if (r.width == a || r.height == b) {
				dreptunghi = null;
				System.out.println("Similar shape is already on the list. ");
			} else { list.add(dreptunghi);}				
		}     
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = (this.width + this.height) * 2;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		this.surface = this.width * this.height;
		return this.surface;
	}
	
}
