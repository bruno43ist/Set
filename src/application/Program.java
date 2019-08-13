package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		//HashSet não mantem a ordem dos elementos
		//Set<String> set = new HashSet<>();
		
		//TreeSet ordena os elementos
		//Set<String> set = new TreeSet<>(); 
		
		//LinkedHashSet mantem a ordem dos elementos
		Set<String> set = new LinkedHashSet<>();
		
		
		//HASHSET NÃO GARANTE A ORDEM DOS ELEMENTOS
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}

	}

}
