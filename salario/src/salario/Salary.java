package salario;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner teclado = new  Scanner(System.in);
		
		Calculo c1 = new Calculo();
		
		System.out.print("Name: ");
		c1.name = teclado.nextLine();
		System.out.print("Gross Salary: ");
		c1.grossSalary = teclado.nextDouble();
		System.out.print("Tax: ");
		c1.tax = teclado.nextDouble();
		
		System.out.println("Employee: " + c1);
		System.out.print("Wich percentage to increase salary: " );
		double percentage = teclado.nextDouble();
		c1.increaseSalary(percentage);
		
		System.out.println("Update data: " + c1);
		teclado.close();
			

	}

}
