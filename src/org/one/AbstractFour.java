package org.one;

class AbstractFour {

	int x = 40;

	public AbstractFour() {

	}

	void method4() {
		int y = 30;
		System.out.println(x);
		System.out.println(y);

	}

	public static void main(String[] args) {
		AbstractFour k = new AbstractFour();
		k.method4();
		final String r = "20";
		System.out.println(r);

	}
}
