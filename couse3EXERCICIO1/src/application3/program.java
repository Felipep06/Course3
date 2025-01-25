package application3;

import java.util.Locale;
import java.util.Scanner;

import entities3.Student;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Qual nome do aluno: ");
		student.name = sc.nextLine();
		System.out.println("Primeira nota: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Segunda nota: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Terceiro nota: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRANDE: %.2f%n" , student.finalGrade());
		System.out.println();
		
		if (student.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		sc.close();
	}

}
