package org.one;

public class Ktm implements Bike{
	@Override
	public void cost() {
		System.out.println("100000");
		
	}

	@Override
	public void speed() {
		System.out.println("100km");
		
	}
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}

}
