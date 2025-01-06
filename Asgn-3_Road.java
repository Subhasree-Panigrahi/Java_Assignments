/*Exercise Objective(s): The concept of inheritance
Exercise: Create a class called Vehicle. Create subclasses like Truck, Bus, Car etc. Add common methods
in the base class and specific methods in the corresponding class. Create a class called Road
and create objects for the Truck, Car, Bus etc and display the appropriate message.*/

package com.cts.asgn_3;

class Vehicle {
	String name;

	void setName(String vehicleName) {
		name = vehicleName;
	}

	void display() {
		System.out.println("This is a " + name);
	}
}

class Truck extends Vehicle {
	void displayTruck() {
		System.out.println(name + " is displayed.");
	}
}

class Bus extends Vehicle {
	void displayBus() {
		System.out.println(name + " is displayed.");
	}
}

class Car extends Vehicle {
	void displayCar() {
		System.out.println(name + " is displayed.");
	}
}

public class Road {
	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.setName("Truck");
		truck.display();
		truck.displayTruck();
		Bus bus = new Bus();
		bus.setName("Bus");
		bus.display();
		bus.displayBus();
		Car car = new Car();
		car.setName("Car");
		car.display();
		car.displayCar();
	}
}
