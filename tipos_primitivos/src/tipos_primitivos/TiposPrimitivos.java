package tipos_primitivos;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.print("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();
		
		//System.out.println("Sua nota � " + nota);
		//System.out.printf("Sua nota � %.2f \n", nota);
		//System.out.printf("Sua nota � %.4f \n", nota);
		System.out.printf("A nota de  %s � %.2f \n", nome , nota);
		teclado.close();

	}

}
