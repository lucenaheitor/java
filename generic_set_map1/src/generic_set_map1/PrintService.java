package generic_set_map1;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {// <T>  padroniza o tipo por isso generic
	
	public int first;

	List<T> list = new ArrayList<>();
	
	public void addValue(T  value) {
		list.add(value);

	}
	
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("list is empty");
		}
	   return list.get(0);
	}


	public Integer print() {
		return (Integer) first();
		
	} 
		
}
