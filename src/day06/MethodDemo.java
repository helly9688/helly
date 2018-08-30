package day06;



//方法的演示
public class MethodDemo {
	public static void main(String[] args) {
	say();
	sayHi("dxl");
	sayHello("dxl", 25);
	double a = getNum();
	System.out.println(a);
	int a1 = 12;
	int b = 2;
	int c = plus(a1, b);
	System.out.println("a1+"+"b="+a1+"+"+b+"="+c);
	int d = plus(14,14);
	System.out.println("sum="+d);
	}
	public static void say() {
		System.out.println("我叫dxl，今年5岁了");
	}
	public static void sayHi(String name) {
		System.out.println("我叫"+name+"，今年5岁了");
	}
	public static void sayHello(String name, int age) {
		System.out.println("我叫"+name+"，今年"+age+"岁了");
	}
	
	public static double getNum() {
		return 8.88;
		  
	}
	public static int plus(int n,int m) {
		int a = m+n;
		return a;
	}
}
