package tipos_primitivos2;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.print("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();
		
		//System.out.println("Sua nota é " + nota);
		//System.out.printf("Sua nota é %.2f \n", nota);
		//System.out.printf("Sua nota é %.4f \n", nota);
		System.out.printf("A nota de  %s é %.2f \n", nome , nota);
		teclado.close();


	}

}
