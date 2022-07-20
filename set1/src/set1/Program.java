/*Set é um conjunto de elementos similr a algebra
 * n  permite repetiçõees
 *  os elemeentos n tem posição
 *  o acesso, inserção e  remoção de  elementos são rapidas
 *  oferece  operação  eficiente de conjunto como: inserção uniãso e remoçãi.
 *   principais implementações:
 *     HashSet(operação mais rapida mas n ordenada
 *     TreeSet( mais lendo e  ordenado oelo compareTo)
 *     LinkedSet( velocidade intermediaria e é ordenado a medida q sao colocados)
 */
package set1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Tv");
		set.add("Notbook");
		set.add("RTX 3090 TI");
		
		System.out.println(set.contains("RTX 3090 TI"));
		
		for(String p : set) {
			System.out.println(p);
		}

	}

}
