/*1) Exercise Objective(s):Package
Exercise:Create a package called shapes. Create some classes in the package representing some
common geometric shapes like Square, Triangle, Circle and so on. Create a class called TestShapes 
and create objects for all the shapes and print corresponding messages.
Execute the TestShapes class.*/

package com.cts.shapes;

class Square { 
	void displaySquare() {
	System.out.println("----SQUARE----");
	System.out.println("Sides: 4, Edges:4, Vertices: 4");
	} 
}

class Triangle {
	void displayTriangle() {
		System.out.println("----TRIANGLE----");
		System.out.println("Sides: 3, Edges:3, Vertices: 3");
	} 
}

class Circle {
	public void displayCircle() {
		System.out.println("----CIRCLE----");
		System.out.println("Sides: 0, Edges:0, Vertices: 0");
	}
}

	public class TestShapes {
		public static void main(String[] args) {
			Square obj1 = new Square(); 
			obj1.displaySquare();
			Triangle obj2 = new Triangle(); 
			obj2.displayTriangle();
			Circle obj = new Circle(); 
			obj.displayCircle();
	}
}                      
