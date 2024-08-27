package org.one;



public class SingleTon {
	static SingleTon car;
	public SingleTon() {
		System.out.println("hello");
	}
	private static SingleTon method5() {
		if(car==null) {
			System.out.println(System.identityHashCode(car));
			car=new SingleTon();
			System.out.println(System.identityHashCode(car));
			
		}
		return car;
		

	}
private void method7() {
	System.out.println("&&&&&&&&&&&&&");
	

}
public static void main(String[] args) {
	
	SingleTon object = method5();
	SingleTon method5 = method5();
	System.out.println(System.identityHashCode(method5));
	SingleTon method52 = method5();
	System.out.println(System.identityHashCode(method52));
     object.method7();
	
}
	
	

}
