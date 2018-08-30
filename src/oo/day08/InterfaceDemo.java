package oo.day08;
public class InterfaceDemo {
	public static void main(String[] args) {
		
	}
}
class Eoo implements inter4{
	public void e() {}
	public void show() {}
}

interface inter4 extends inter3{
	void e();
}
abstract class Coo{
	 
}
class Boo implements inter3,inter4{
	public void show() {}
	public void test() {}
	public void e() {}
}
interface inter3{
	void show();
}
interface inter41{
	void test();
}



//接口的是实现
interface inter2{
	void show();
	void test();
}
class Aoo implements inter2{
	public void show() {}
	public void test() {}
}


//接口的语法
interface inter1{
	public static final int PI = 5;
	public abstract void show();
	int COUNT  = 5;
	void test();
	//int number;
	//void say() {}
	
}
