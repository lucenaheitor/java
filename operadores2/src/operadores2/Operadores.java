package operadores2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digitie um numero: ");
		int n1 = teclado.nextInt();
		System.out.print("Digite outro numero :");
		int n2 = teclado.nextInt();
		System.out.print("O resultado é: ");
		float m = (float) Math.pow(n1, n2);
		System.out.println("A média é : "+ m);
		teclado.close();
		/*int x = 4;
		x *= 2; // x = x +2
		System.out.print(x);*/
		
		/*float v =8.5f;
		int ar = (int) Math.round(v);
		System.out.print(ar);*/
		
		double ale = Math.random();
		int n = (int) (5 + ale *(10-5));
		System.out.print(n);
		teclado.close();

	}

}
