package org.one;

public class Fibonnacci {
	    public static void main(String[] args) {
	        int n1 = 0, n2 = 1, n3;

	        System.out.print(n1 + " " + n2);

	        for (int i = 2; i < 100; ++i) {
	            n3 = n1 + n2;
	            if (n3 > 100) break;  // Stop if the number exceeds 100
	            System.out.print(" " + n3);
	            n1 = n2;
	            n2 = n3;
	        }
	    }
	}
	
	
	
