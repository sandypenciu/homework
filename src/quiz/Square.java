package quiz;
import java.util.Scanner;
import java.util.*;

public class Square implements Shapes {
	List<Square> listSq = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double side;

	public Square(double a) {
		this.side = a;		
	}
	
	public Square() {
		
	}
	
	@Override
	public void addShape() {
		System.out.println("Enter the side. ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		Square patrat = new Square(a);
		for (Square s : listSq) {
			if (s.side == a) {
				patrat = null;
				System.out.println("Similar shape is already on the list. ");
			} else {listSq.add(patrat);}
		}
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = 4 * this.side;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		this.surface = this.side * this.side;
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Square s : listSq) {
			totalP = totalP + s.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for (Square s : listSq) {
			totalS = totalS + s.calculateSurface();
		}
		return totalS;
	}
	
}