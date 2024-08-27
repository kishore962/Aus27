package org.one;

public class ExceptionOne extends BeanClass{
	
		

	
	public static void main(String[] args) {
		BeanClass k = new BeanClass();
		k.setId(23456);
		k.setPassword("kishore");
		 int id2 = k.getId();
		 System.out.println(id2);
		 String password2 = k.getPassword();
		System.out.println(password2);
		
	}

}
