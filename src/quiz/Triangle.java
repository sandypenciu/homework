package quiz;

import java.util.*;

public class Triangle implements Shapes {
	List<Triangle> listTr = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double a, double b, double c) {
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
	}
	
	public Triangle() {
		
	}
	
	@Override
	public void addShape() {
		System.out.println("Enter sides: ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();
		Triangle triunghi = new Triangle (a, b, c);
		for (Triangle t : listTr) {
			if (t.side1 == a || t.side1 == b || t.side1 == c || t.side2 == a || t.side2 == b || t.side2 == c || t.side3 == a || t.side3 == b || t.side3 ==c) {
				triunghi = null;
				System.out.println("Similar shape is already on the list. ");
			} else {listTr.add(triunghi);}
		}
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = this.side1 + this.side2 + this.side3;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		double p = this.perimeter / 2;
		this.surface = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Triangle t : listTr) {
			totalP = totalP + t.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for (Triangle t : listTr) {
			totalS = totalS + t.calculateSurface();
		}
		return totalS;
	}
}
	