package org.one;
import java.util.*;

public class FreeFire {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
	    System.out.println("student id");
	    int h = k.nextInt();
	    System.out.println(h);
	    System.out.println("student name");
	    String y = k.next();
	    System.out.println(y);
	   
	    System.out.println("mark1");
	     double t = k.nextDouble();
	   
	    System.out.println(t);
	    System.out.println("mark2");
	    double e = k.nextDouble();
	   
	    System.out.println(e);
	    System.out.println("mark3");
	    double a = k.nextDouble();

	    System.out.println(a);
	    System.out.println("mark4");
	    double v = k.nextDouble();
	   
	    System.out.println(v);
	    System.out.println("mark5");
	    double l = k.nextDouble();
	 System.out.println(l);

	    
	    double sum=t+e+a+v+l;
	    double average=sum/5;
	    
	    System.out.println(sum);
	    System.out.println(average);
	    
	    
	    
	}

}
