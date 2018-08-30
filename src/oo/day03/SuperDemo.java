package oo.day03;
public class SuperDemo {
	public static void main(String[] args) {
		Boo boo = new Boo();
		Doo doo = new Doo();
	}
}
class Aoo{
	 Aoo() {
		System.out.println("超类构造方法");
	}
}
class Boo extends Aoo{
	Boo(){
		System.out.println("派生类构造方法");
	}
}
class Coo{
	Coo(int n){
		System.out.println("hahaha");
	}
}
class Doo extends Coo{
	Doo(){
		super(0);
		System.out.println("hihaihi");
	}
}
