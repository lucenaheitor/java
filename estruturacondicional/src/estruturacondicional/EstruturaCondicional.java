package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner teclado = new Scanner(System.in);
		System.out.print("Digite  a primeira nota: ");
		float n1 = teclado.nextFloat();
		System.out.print("Digite  a segunda nova: ");
		float n2 = teclado.nextFloat();
		float res = (n1 + n2)/2;
		System.out.print("A média do aluno é: " + res);
		if(res >= 8) {
			System.out.print(" ALUNO APROVADO");
		}else {
			System.out.print(" ALUNO REPROVADO ");
		}*/		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Em que ano você nasceu?: ");
		int nasc = teclado.nextInt();
		int i = 2022 - nasc;
		System.out.print("SUA IDADE É : "+ i);
		if(i >=18 && i<= 20){
			System.out.print(" MAIOR DE IDADE: ");
		}else if(i > 20  &&  i <=50){
			System.out.print("VOCÊ É UM ADULTO: ");	
		}else if(i > 50 && i <100){
			System.out.println(" VOCÊ ESTÁ  IDOSO, INVALIDO, QUASE MORTO:");
		}else{
			System.out.print(" IDADE INVALIDA");
			teclado.close();
		}

	}

}
