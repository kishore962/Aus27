package org.one;

public class Palindrome {
	public static void main(String[] args) {

		String a="qwerttt";

		String d="";
		
		for(int i=a.length()-1;i>=0;i--) {
			
			 d+=a.charAt(i);
			
		}
		System.out.println(d);

	}
}
