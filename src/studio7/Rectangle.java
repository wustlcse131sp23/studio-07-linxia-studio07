package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	/*
	public Rectangle() {
		length = 0;
		width = 0;
	}
	*/
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	public boolean ifSquare() {
		return length == width;
	}
	
	public boolean ifSmaller(Rectangle r) {
		return this.getArea() < r.getArea();
	}
	
	public void drawRectangle() {
		StdDraw.rectangle(.5,.5,width/2,length/2);
	}
	
	public String toString() {
		return "length:" + length + " width:" + width + "area: " 
				+ this.getArea() + " perimeter: " + this.getPerimeter();
	}
  	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(.4,.7);
		Rectangle r2 = new Rectangle(.5,.5);
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(r1.ifSmaller(r2));
		System.out.println(r2.ifSquare());
		r1.drawRectangle();


	}

}
