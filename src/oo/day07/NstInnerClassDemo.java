package oo.day07;
public class NstInnerClassDemo {
	public static void main(String[] args) {
		Aoo o1 = new Aoo() {		
		};
		Aoo o2 = new Aoo() {
		};
		Boo o3 = new Boo() {
			void show() {
				System.out.println("showshow");
			}
		};
		o3.show();
	}
}

abstract class Boo{
	abstract void show();
}
abstract class Aoo{
	
}
