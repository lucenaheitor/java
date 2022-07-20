package map;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	
	public static void main(String[] args) {
		
		
		
		
		Map<String, String> cookies =  new  TreeMap<>();
		
		cookies.put("Username", "Egirls_safada");
		cookies.put("Email", "juliaegirl@gmail.com");
		cookies.put("phone", "970707070");
		
		//cookies.remove("phone");
		
		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " +cookies.get(key));
		}
		
	}
}
