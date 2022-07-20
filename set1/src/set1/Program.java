/*Set � um conjunto de elementos similr a algebra
 * n  permite repeti��ees
 *  os elemeentos n tem posi��o
 *  o acesso, inser��o e  remo��o de  elementos s�o rapidas
 *  oferece  opera��o  eficiente de conjunto como: inser��o uni�so e remo��i.
 *   principais implementa��es:
 *     HashSet(opera��o mais rapida mas n ordenada
 *     TreeSet( mais lendo e  ordenado oelo compareTo)
 *     LinkedSet( velocidade intermediaria e � ordenado a medida q sao colocados)
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
