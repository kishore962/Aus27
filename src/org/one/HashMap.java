package org.one;
import java.util.*;

public class HashMap {
	public static void main(String[] args) {
		Map<Character,Integer>k1=new LinkedHashMap<Character,Integer>();
		System.out.println(k1);
		k1.put('!', 10);
		k1.put('@', 20);
		k1.put('#', 30);
		k1.put('$', 40);
		k1.put('%', 50);
		k1.put('^', 60);
		k1.put('&', 10);
		k1.put('*', 50);
		k1.put('(', 40);
		System.out.println(k1);
		
		
		
	}

}
