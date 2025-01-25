package application2;

import java.util.Locale;
import java.util.Scanner;

import entities2.Employee;

public class program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		Employee emp = new Employee();	
			
		System.out.println("Name: ");
		emp.name = sc.nextLine();	
		System.out.println("Gross salary: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.Tax = sc.nextDouble();
		
		System.out.println();	
		System.out.println("Empoyee: " + emp);
		System.out.println();
		System.out.println("Which pecentage to increase salary: ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Upadated data: "+ emp);
		
		sc.close();
		
			
			
	}
}