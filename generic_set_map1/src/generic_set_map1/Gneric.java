/*Generics: permitem que classes, interface e metodos possam  ser parametrizados por tipo.
 * beneficifios:
 * Reuso
 *  type safety
 *  peformance
 *  uso em cole??o
 *  
 *  List<String> list = new Arraylist<>();
 *  list.add("Maria");
 *  String name list.get(0);
 */




package generic_set_map1;

import java.util.Scanner;

public class Gneric {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.println("How many value: ");
		int n  = sc.nextInt();
		
		
		for (int i =0; i<n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		sc.close();
	}
}
