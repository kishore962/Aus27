package org.one;
import java.util.*;


public class Reverse {
public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
	System.out.println("reverse the number");
	String l = k.next();
	System.out.println(l);

	String d="";
	for (int i =l.length()-1; i>=0; i--) {
		d+=l.charAt(i);
		
	}
	System.out.println(d);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}