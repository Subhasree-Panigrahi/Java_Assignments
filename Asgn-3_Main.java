/*Exercise Objective(s):Overloading
Exercise:Create a class called shape with the following methods
1. area
2. perimeter
Overload the area and perimeter method to calculate for both square and rectangle.
Create a main class and invoke the area method to calculate the area of the square and
rectangle. Also invoke the perimeter method to calculate the perimeter of the square
and rectangle.*/

package com.cts.shapes;

class Shape{

	public double area(double side){
		return side*side;
	}
	
	public double perimeter(double side){
		return 4*side;
	}

	public double area(double length,double breadth){
		return length*breadth;
	}

	public double perimeter(double length,double breadth){
		return 2*(length+breadth);
	}

}
public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape();
		double sqSide = 2;
		double rectLength = 3;
		double rectBreadth = 6;
		System.out.println("Area of square: " + shape.area(sqSide));
		System.out.println("Perimeter of square: " + shape.perimeter(sqSide));
		System.out.println("Area of rectangle: " + shape.area(rectLength, rectBreadth));
		System.out.println("Perimeter of rectangle: " + shape.perimeter(rectLength, rectBreadth));
	}
}
