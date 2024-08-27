package org.one;

public class ExceptionClass {
	public static void main(String[] args) {
		try {
			String k = null;
			System.out.println(k.charAt(0));
			
			
		}
		catch(NullPointerException e){
			e.printStackTrace();
			
			
			
		}
		System.out.println(2);
		System.out.println(3);
	}


	
	}


