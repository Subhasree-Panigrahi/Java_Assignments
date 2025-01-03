//Exercise 5: Take Employee Info like empid, empname, empsal, empAdd, empGender, 
//empEmail and display .

package cts.emp;
import java.util.Scanner;

public class Employee {
	int empId;
	String empName, empAdd, empGender, empEmail;
	double empSal;
	
	public void getDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		empName = sc.nextLine();
		System.out.println("Enter Employee Salary:");
		empSal = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Employee Address:");
		empAdd = sc.nextLine();
		System.out.println("Enter Employee Gender:");
		empGender = sc.nextLine();
		System.out.println("Enter Employee Email:");
		empName = sc.nextLine();
	}
	public void display() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empSal);
		System.out.println("Employee Address:"+empAdd);
		System.out.println("Employee Gender:"+empGender);
		System.out.println("Employee Email:"+empEmail);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.getDetails();
		emp.display();
	}
}
