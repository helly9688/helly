package oo.day09;
public class MultiTypeDemo {
	public static void main(String[] args) {
		Aoo o = new Boo();
		Boo o1 = (Boo)o;
		inter1 o2 = (inter1)o;
		//Coo o3 = (Coo)o;
		if(o instanceof Coo) {
			Coo o4 = (Coo)o;
		}
	}
}
interface inter1{}
class Aoo{}
class Boo extends Aoo implements inter1{}
class Coo extends Aoo{}