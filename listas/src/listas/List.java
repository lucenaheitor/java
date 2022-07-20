package listas;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		
		ArrayList<String> classe = new ArrayList<>();
		
		classe.add("Mage");
		classe.add("Warrior");
		classe.add("lancer");
		classe.add("bard");
		classe.add("sorcere");
		classe.add("Assassin");
		classe.add("Paladin");
		classe.add(2,"healer");
		
		//classe.remove(1);
		
		for(String x : classe) {
			System.out.println(x);
			
		}
		System.out.println("-----------------------------");
		classe.removeIf(x -> x.charAt(0) == 'P');// remove tbm pode remover elementos da lista que atenda um predicado
			// tbm é uma função lambda( essa  em particular  é predicado).
		for (String x : classe) {
			System.out.println(x);
			
		}
		
		System.out.println("---------------------------");
		System.out.println("Index of mage: " +classe.indexOf("Mage"));// serve pra encontrar algum elemento da ArrayList
		System.out.println("Index of mage: " +classe.indexOf("Ladino"));// caso o elemento não tenha lista, ele aparece como -1
		
		
		System.out.println("-----------------------------");
		//List<String> result = list.stream().filter(x -> x.charAt(0) =='h').collect(collectors.toList()); 
		
		
	}

}
