package org.one;
import java.util.*;

import java.util.Iterator;

public class Reverse2 {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("reverse the number");
		String e = k.next();
		System.out.println(e);
		String rev="";
		for (int i=e.length()-1; i>=0; i--) {
			rev+=e.charAt(i);
			
		}
		System.out.println(rev);
	}

}
