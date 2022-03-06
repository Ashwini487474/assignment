package Assisted_Practice_project;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// Map
		//HashMap
		System.out.println("HashMap\n");
		HashMap<Integer,String> var = new HashMap<Integer, String>();
		var.put(3,"sam");
		var.put(1,"ram");
		var.put(2,"jam");
		for(Entry<Integer, String> var1 : var.entrySet()) {
			System.out.println(var1.getKey()+" "+var1.getValue());
		}
		//HashTable
		System.out.println("\nHashTable\n");
		Hashtable<Integer,String> HashT = new Hashtable<Integer, String>();
		HashT.put(8,"mahesh");
		HashT.put(2,"suresh");
		HashT.put(6,"ramesh");
		for(Entry<Integer,String> HashT1 : HashT.entrySet()) {
			System.out.println(HashT1.getKey()+" "+HashT1.getValue());
		}
		//TreeMap
		System.out.println("\nTreeMap\n");
		TreeMap<Integer,String> Tmap = new TreeMap<Integer, String>();
		Tmap.put(9,"kumar");
		Tmap.put(6,"kumari");
		Tmap.put(5,"jai");
		for(Entry<Integer,String> Tmap1 : Tmap.entrySet()) {
			System.out.println(Tmap1.getKey()+" "+Tmap1.getValue());
		}
		
		

	}

}
