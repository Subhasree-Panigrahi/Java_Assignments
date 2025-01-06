/*Lab Exercise No:4
Create a class named 'Member' having the following members: Data members 1 - Name 2 - Age 3 - Phone number 4 - Address 5 - Salary It also has a method named 
'printSalary' which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes 
have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making 
an object of both of these classes and print the same.*/

package com.cts.asgn_3;

class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	void printSalary() {
		System.out.println("Salary: " + salary);

	}
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
		printSalary();

	}
}

class Employee extends Member {
	String specialization;
	void displayEmployeeDetails() {
		System.out.println("Specialization: " + specialization);
		displayDetails();
	}
}

class Manager extends Member {
	String department;
	void displayManagerDetails() {
		System.out.println("Department: " + department);
		displayDetails();
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Subhasree";
		e.age = 22;
		e.phoneNumber = "1234567890";
		e.address = "Hyderabad";
		e.salary = 30000;
		e.specialization = "Java";
		System.out.println("Employee Details:");
		e.displayEmployeeDetails();

		Manager m = new Manager();
		m.name = "Riya";
		m.age = 21;
		m.phoneNumber = "0987654321";
		m.address = "Bengaluru";
		m.salary = 40000;
		m.department = "Human Resources";
		System.out.println("\nManager Details:");
		m.displayManagerDetails();

	}
}
