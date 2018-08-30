package oo.day04;

import oo.day03.SuperDemo;

public class UploadDemo {
	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.a = 1;
		o1.show();
		
		Boo o2 = new Boo();
		o2.a = 2;
		o2.b = 3;
		o2.test();
		o2.show();
		
		Aoo o3 = new Boo();
		o3.a = 4;
		o3.show();
		//o3.b = 45;	
	}
}

class Aoo{
	int a;
	void show() {	
	}
}
class Boo extends Aoo{
	int b;
	void test() {
	}
	
}
