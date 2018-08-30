package oo.day02;
public class NullRefDemo {
	public static void main(String[] args) {
		Student zs = new Student("zhangsan",25,"LF");
		System.out.println(zs.age);
		zs = null;
		//System.out.println(zs.age);//nullpointerexception
		
		Student lS = new Student("lisi",26,"JMS");
		Student lss = lS;
		System.out.println(lS.age);
		lss.age = 28;
		System.out.println(lss.age);
		
		int a= 5;
		int b= a;
		b = 8;
		System.out.println(a);
		
		
	}
}
