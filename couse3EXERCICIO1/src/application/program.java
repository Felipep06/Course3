package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle windth and heigth: ");
		rectangle.Width = sc.nextDouble();
		rectangle.Heigth = sc.nextDouble();
		System.out.println();
		System.out.printf("AREA: %.2f%n" , rectangle.Area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.Perimeter());
		System.out.printf("DIAGONAL: %.2f%n",  rectangle.Diagonal());
		
		
		
		
		
		sc.close();
	}

}
