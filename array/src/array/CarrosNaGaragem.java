package array;

import java.util.Scanner;

public class CarrosNaGaragem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*ArrayList<String>  carros = new ArrayList<String>();
		
		carros.add("SURUBA");
		carros.add("Ferrari");
		carros.add("Lambo");
		
		
		System.out.println(carros);*/
		
		Scanner ler = new Scanner(System.in);
		
		 int n = ler.nextInt();
		 int x =  ler.nextInt();
		 int z = ler.nextInt();
		 ler.close();
		 System.out.println(String.format("%d\n%d\n%d\n", x, n, z));

	}

}
