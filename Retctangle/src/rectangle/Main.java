package rectangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Calculo rect = new Calculo();
		System.out.println("Write  width and height: ");
		rect.width = teclado.nextDouble();
		rect.height = teclado.nextDouble();
		
		System.out.printf("Area = %.2f%n" , rect.area());
		System.out.printf( "Perimeter = %.2f%n", rect.perimeter());
		System.out.printf("Perimeter = %.2f%n ", rect.diagonal());
		teclado.close();
	}

}
