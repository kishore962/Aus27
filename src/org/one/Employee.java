package org.one;

public class Employee {
	
	private void empid(int x ,char u) {
		System.out.println(x+"/t"+u);
		
		

	}
	private void empid(float x,double y) {
		System.out.println(x+" "+y);

	}
	private void empid(String w,int g) {
		System.out.println(w+" "+g);

	}
	public static void main(String[] args) {
		Employee k=new Employee();
		k.empid(76567, '@');
		k.empid(77776.777f, 98798.9878d);
		k.empid("kishore", 989898);

}
}